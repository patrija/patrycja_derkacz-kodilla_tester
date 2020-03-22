package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService;
    private Notification notification;

    public ShippingCenter(DeliveryService deliveryService, Notification notification) {
        this.deliveryService = deliveryService;
        this.notification = notification;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notification.success(address);
        }
        else notification.fail(address);
    }
}
