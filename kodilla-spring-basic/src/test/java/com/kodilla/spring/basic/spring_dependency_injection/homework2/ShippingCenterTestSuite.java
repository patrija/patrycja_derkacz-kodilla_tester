package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueWhenWeightIsInRange(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);

        boolean result = bean.deliverPackage("Down Street", 5.0);

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenWeightIsNotInRange(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);

        boolean result = bean.deliverPackage("Down Street", 31.0);

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnSuccessNotification(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);

        String successNotification = bean.success("Down Street");

        Assertions.assertEquals("Package delivered to: Down Street", successNotification);
    }

    @Test
    public void shouldReturnFailNotification(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);

        String failNotification = bean.fail("Down Street");

        Assertions.assertEquals("Package not delivered to: Down Street", failNotification);
    }

    @Test
    public void shouldReturnSuccessNotificationFromShippingCenter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);

        String successNotificationFromSC = bean.sendPackage("Down Street", 10.0);

        Assertions.assertEquals("Package delivered to: Down Street", successNotificationFromSC);
    }

    @Test
    public void shouldReturnFailNotificationFromShippingCenter(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);

        String failNotificationFromSC = bean.sendPackage("Down Street", 35.0);

        Assertions.assertEquals("Package not delivered to: Down Street", failNotificationFromSC);
    }
}
