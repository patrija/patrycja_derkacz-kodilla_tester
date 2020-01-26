package com.kodilla.inheritance.homework;

public class WindowsXp extends OperatingSystem {

    public WindowsXp(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Xp");
    }

    public void turnOff(){
        System.out.println("Turning off Xp");
    }
}
