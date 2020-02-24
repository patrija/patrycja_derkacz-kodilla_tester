package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(34.50, LocalDate.of(2019,12,31), "Janusz25");
    Order order2 = new Order(99.99, LocalDate.of(2020,2,21), "Maks");
    Order order3 = new Order(50.95, LocalDate.of(2019,1,1), "Kaska");
    Order order4 = new Order(74.00, LocalDate.of(2020,2,13), "Przemek");
    Order order5 = new Order(12.00, LocalDate.of(2019,9,15), "Rudy");

    @Test
    public void shouldAddOrderToShop() {

        //When
        int result = shop.getSize();
        //Then
        assertEquals(5,result);
    }

    @Test
    public void shouldGetListOfOrdersWithinRangeOfPrices(){

        //When
        List result = shop.getListOfOrdersWithinRange(50.0, 100.0);

        //Then
        assertEquals(order2, result.get(0));
        assertEquals(order3, result.get(1));
        assertEquals(order4, result.get(2));
    }

    @Test
    public void shouldGetEmptyListWhenPriceNotExist(){
        //When
        List result = shop.getListOfOrdersWithinRange(500.0, 600.0);

        //Then
        assertEquals(new ArrayList(), result);
    }

    @Test
    public void shouldGetEmptyListWhenPriceIsNegative(){
        //When
        List result = shop.getListOfOrdersWithinRange(-50.0,-100.0);

        //Then
        assertEquals(new ArrayList(), result);
    }

    @Test
    public void shouldGetTotalPriceOfOrders(){
        //When
        double result = shop.getTotalPriceOfOrders();

        //Then
        assertEquals(271.44, result, 0.01);
    }

    @Test
    public void shouldGetSizeOfShop(){
        //When
        int result = shop.getSize();

        //Then
        assertEquals(5, result);
    }

    @Test
    public void getListOfOrdersWithinRangeOfDates(){
        //given
        LocalDate startDate = LocalDate.of(2019,1,1);
        LocalDate endDate = LocalDate.of(2019,12,31);

        //when
        List result = shop.getListOfOrdersWithinRangeOfDates(startDate, endDate );

        //then
        assertEquals(order1, result.get(0));
        assertEquals(order3, result.get(1));
        assertEquals(order5, result.get(2));
    }

    @BeforeEach
    public void initializeShop(){

        shop.addNewOrderToShop(order1);
        shop.addNewOrderToShop(order2);
        shop.addNewOrderToShop(order3);
        shop.addNewOrderToShop(order4);
        shop.addNewOrderToShop(order5);
    }
}