package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car (int wheels, int seats) {
        //System.out.println("Car constructor");
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLights() {
        System.out.println("Lights were turn on");
    }

    public void openingDoors(){
        System.out.println("Opening 4 doors.");
    }

    public int getWheels(){
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void displayNumbersOfSeats(){
        System.out.println("Number of seats: "+ seats);

    }
}

