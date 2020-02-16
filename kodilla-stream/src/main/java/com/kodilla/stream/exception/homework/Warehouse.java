package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orders = new ArrayList<>();
    public void addOrder(Order order){
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        //List<Order> temporary =
        return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
        //if(orders.size() != 0)
        //    return temporary.get(0);
        //throw new OrderDoesntExistException();
    }




    @Override
    public String toString() {
        return "Warehouse{" +
                "orders=" + orders +
                '}';
    }
}
