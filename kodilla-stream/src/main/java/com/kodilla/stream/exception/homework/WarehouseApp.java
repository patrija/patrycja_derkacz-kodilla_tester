package com.kodilla.stream.exception.homework;

public class WarehouseApp {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();



        warehouse.addOrder(new Order("256"));
        warehouse.addOrder(new Order("25"));
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("354"));
        System.out.println(warehouse);



        try {
            Order orderNumber = warehouse.getOrder("12");
            System.out.println("Number of order is: " + orderNumber.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("This order do not exist.");
        }

    }
}
