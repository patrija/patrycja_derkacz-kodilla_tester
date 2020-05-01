package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testSelectUsersAndPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while(rs.next()) {
            count++;

        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUE('Maks', 'Maksinski')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUE('34', 'anyone here?')" ;
        statement.executeUpdate(sql);
        sql= "INSERT INTO POSTS(USER_ID, BODY) VALUE('34', 'HELLO')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " +
                rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        int expected = count + 1;
        Assert.assertEquals(expected, counter);

    }

}