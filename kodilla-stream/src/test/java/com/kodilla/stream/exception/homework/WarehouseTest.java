package com.kodilla.stream.exception.homework;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class WarehouseTest {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("12"));

        //when
        Order result = warehouse.getOrder("12");

        //then
        assertNotNull(result);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrderWithException() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("5"));

        //when
        Order result = warehouse.getOrder("64");

        //then
        assertNull(result);
    }

}