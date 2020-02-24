package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Order> orders = new ArrayList<>();

    public void addNewOrderToShop(Order order) {
        orders.add(order);
    }

    public int getSize(){
        return orders.size();
    }

    public double getTotalPriceOfOrders() {
        double sum = 0;
        for (Order orderElement : orders) {
            double price = orderElement.getPrice();
            sum = sum + price;
        }
        return sum;
    }

    /*
    public List getListOfOrdersFromTwoYears () {
        LocalDate currentDate = LocalDate.now();
        LocalDate twoYearsAgoDate = currentDate.minusYears(2);
        List<Order> result = new ArrayList<>();
        for (Order orderElement : orders) {
            if (orderElement.getDate().isAfter(twoYearsAgoDate)) {
                result.add(orderElement);
            }
        }
            return result;
    }

     */

    public  List getListOfOrdersWithinRangeOfDates(LocalDate startDate, LocalDate endDate){
        List<Order> result = new ArrayList<>();
        for (Order orderElement : orders) {
            if ((orderElement.getDate().isAfter(startDate) || orderElement.getDate().isEqual(startDate)) && (orderElement.getDate().isBefore(endDate) || orderElement.getDate().isEqual(endDate))) {
                result.add(orderElement);
            }
        }
        return result;
    }

    public List getListOfOrdersWithinRange(double min, double max) {
        List<Order> result = new ArrayList<>();
        for(Order orderElement : orders){
            if(orderElement.getPrice() > min && orderElement.getPrice() < max){
                result.add(orderElement);
            }
        }
        return result;
    }

}
