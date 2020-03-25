package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;


@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldReturnSuvForWinter() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = (Car) context.getBean("returnCar", "winter", LocalTime.of(12,00));

        String carType = car.getCarType();
        System.out.println(carType);

        Assertions.assertEquals("SUV", carType);
    }

    @Test
    public void shouldReturnSedanForSpring(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = (Car) context.getBean("returnCar", "spring", LocalTime.of(12,00));

        String carType = car.getCarType();;

       Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void shouldReturnCabrioForSummer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = (Car) context.getBean("returnCar", "summer", LocalTime.of(22,00));

        String carType = car.getCarType();

        Assertions.assertEquals("Cabrio", carType);
    }

    @Test
    public void shouldReturnSedanForAutumn(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = (Car) context.getBean("returnCar", "autumn", LocalTime.of(12,00));

        String carType = car.getCarType();;

        Assertions.assertEquals("Sedan", carType);
    }

    @Test
    public void shouldTurnOnLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = (Car) context.getBean("returnCar", "summer", LocalTime.of(22,00));

        boolean checkLights = car.hasHeadlightsTurnedOn(LocalTime.of(22,00));

        Assertions.assertTrue(checkLights);
    }

    @Test
    public void shouldTurnOffLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Car car = (Car) context.getBean("returnCar", "summer", LocalTime.of(14,00));

        boolean checkLights = car.hasHeadlightsTurnedOn(LocalTime.of(14,00));

        Assertions.assertFalse(checkLights);
    }



}
