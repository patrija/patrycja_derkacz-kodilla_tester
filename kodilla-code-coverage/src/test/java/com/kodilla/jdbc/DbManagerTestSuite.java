package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlQuery = "SELECT U.ID, U.FIRSTNAME, U.LASTNAME, COUNT(*)" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        int counter = 0;
        while (rs.next()) {

            counter++;
        }
        System.out.println(counter);


        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES('Maks', 'Maksinski')";
        statement.executeUpdate(sql);
        String sqlCheckID = "SELECT * FROM USERS WHERE FIRSTNAME='Maks' AND LASTNAME='Maksinski'";
        rs = statement.executeQuery(sqlCheckID);
        int checkedID = 0;
        while (rs.next()) {
            checkedID = rs.getInt("ID");

        }
        System.out.println(checkedID);

        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES(" + checkedID + ", 'anyone here?')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES(" + checkedID + ", 'HELLO')";
        statement.executeUpdate(sql);

        String sql2 = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES('Margarita', 'Sanchez')";
        statement.executeUpdate(sql2);
        String sqlCheckID2 = "SELECT * FROM USERS WHERE FIRSTNAME='Margarita' AND LASTNAME='Sanchez'";
        rs = statement.executeQuery(sqlCheckID2);
        int checkedID2 = 0;
        while (rs.next()) {
            checkedID2 = rs.getInt("ID");
        }

        sql2 = "INSERT INTO POSTS(USER_ID, BODY) VALUES(" + checkedID2 + ", 'HOLA!')";
        statement.executeUpdate(sql2);
        sql2 = "INSERT INTO POSTS(USER_ID, BODY) VALUES(" + checkedID2 + ", 'Que tal?')";
        statement.executeUpdate(sql2);
        sql2 = "INSERT INTO POSTS(USER_ID, BODY) VALUES(" + checkedID2 + ", 'Me llamo Margarita')";
        statement.executeUpdate(sql2);


        String sql3 = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES('Eduardo', 'Gonzalez')";
        statement.executeUpdate(sql);
        String sqlCheckID3 = "SELECT * FROM USERS WHERE FIRSTNAME='Eduardo' AND LASTNAME='Gonzalez'";
        rs = statement.executeQuery(sqlCheckID);
        int checkedID3 = 0;
        while (rs.next()) {
            checkedID3 = rs.getInt("ID");
        }

        sql3 = "INSERT INTO POSTS(USER_ID, BODY) VALUES(" + checkedID3 + ", 'its too late')";
        statement.executeUpdate(sql3);


        //When
        rs = statement.executeQuery(sqlQuery);

        //Then
        int count = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME"));
            count++;
        }
        int expected = counter + 2;
        Assert.assertEquals(expected, count);

        //CleanUp
        String deleteRow;
        deleteRow = "DELETE FROM POSTS WHERE USER_ID = " + checkedID;
        statement.executeUpdate(deleteRow);
        deleteRow = "DELETE FROM POSTS WHERE USER_ID = " + checkedID2;
        statement.executeUpdate(deleteRow);
        deleteRow = "DELETE FROM POSTS WHERE USER_ID = " + checkedID3;
        statement.executeUpdate(deleteRow);

        deleteRow = "DELETE FROM USERS WHERE ID = " + checkedID;
        statement.executeUpdate(deleteRow);
        deleteRow = "DELETE FROM USERS WHERE ID = " + checkedID2;
        statement.executeUpdate(deleteRow);
        deleteRow = "DELETE FROM USERS WHERE ID = " + checkedID3;
        statement.executeUpdate(deleteRow);


        rs.close();
        statement.close();
    }


}






