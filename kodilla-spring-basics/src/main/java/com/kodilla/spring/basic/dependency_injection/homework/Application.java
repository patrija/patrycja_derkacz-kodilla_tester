package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        Notification notification = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notification);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
