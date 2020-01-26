package com.kodilla.inheritance.homework;

public class Windows98 extends OperatingSystem {

    public Windows98(int year) {
        super(year);
    }

    public void turnOn() {
        System.out.println("Turning on 98");
    }

    public void turnOff() {
        System.out.println("Turning off 98");
    }
}

