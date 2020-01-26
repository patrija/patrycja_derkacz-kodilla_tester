package com.kodilla.inheritance.homework;

public class OperatingSystem {

    int year;
    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turning on system...");
    }

    public void turnOff() {
        System.out.println("Turning off system...");
    }
}
