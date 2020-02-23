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
    Order order2 = new Order(99.99, LocalDate.of(2020,02,21), "Maks");
    Order order3 = new Order(50.95, LocalDate.of(2019,1,1), "Kaska");
    Order order4 = new Order(74.00, LocalDate.of(2020,2,13), "Przemek");
    Order order5 = new Order(12.00, LocalDate.of(2019,9,15), "Rudy");

    @Test
    public void shouldAddOrderToShop() {

        int result = shop.getSize();

        assertEquals(5,result);
    }

    @Test
    public void shouldGetListOfOrdersWithinRangeOfPrices(){
        List result = shop.getListOfOrdersWithinRange(50.0, 100.0);

        assertEquals(order2, result.get(0));
        assertEquals(order3, result.get(1));
        assertEquals(order4, result.get(2));

    }

    @Test
    public void shouldGetEmptyListWhenPriceNotExist(){
        List result = shop.getListOfOrdersWithinRange(500.0, 600.0);

        assertEquals(new ArrayList(), result);
    }

    @Test
    public void shouldGetEmptyListWhenPriceIsNegative(){
        List result = shop.getListOfOrdersWithinRange(-50.0,-100.0);

        assertEquals(new ArrayList(), result);
    }

    @Test
    public void shouldGetTotalPriceOfOrders(){
        double result = shop.getTotalPriceOfOrders();

        assertEquals(271.44, result, 0.01);
    }

    @Test
    public void shouldGetSizeOfShop(){
        int result = shop.getSize();

        assertEquals(5, result);


    }

    @Test
    public void getListOfOrdersWithinRangeOfDates(){
        List result = shop.getListOfOrdersWithinRangeOfDates(LocalDate.of(2019,1,1), LocalDate.of(2019,12,31));

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