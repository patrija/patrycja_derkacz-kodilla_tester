package com.kodilla.inheritance;

public class Aplication {
    public static void main(String[] args) {
        Car car = new Car(4, 4);
        car.turnOnLights();
        car.openingDoors();
        System.out.println(car.getSeats());
        System.out.println(car.getWheels());
        car.displayNumbersOfSeats();


        Convertible convertible = new Convertible(4, 2);
        convertible.closeRoof();
        convertible.openRoof();
        convertible.turnOnLights();
        convertible.openingDoors();
        System.out.println(convertible.getSeats());
        System.out.println(convertible.getWheels());
        convertible.displayNumbersOfSeats();


    }
}
