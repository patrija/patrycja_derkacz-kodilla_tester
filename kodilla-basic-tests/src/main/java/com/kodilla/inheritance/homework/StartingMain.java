package com.kodilla.inheritance.homework;

public class StartingMain {
    public static void main(String[] args) {

        Windows98 windows98 = new Windows98(1998);
        WindowsXp windowsXp = new WindowsXp(2001);
        OperatingSystem operatingSystem = new OperatingSystem(2020);

        windows98.turnOn();
        windows98.turnOff();
        System.out.println("Production year is: "+ windows98.year);

        windowsXp.turnOn();
        windowsXp.turnOff();
        System.out.println("Production year is: "+ windowsXp.year);

        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println("Production year is: "+ operatingSystem.year);




    }
}
