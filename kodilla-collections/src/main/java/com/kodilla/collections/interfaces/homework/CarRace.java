package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(30,20,0);
        doRace(ford);

        Honda honda = new Honda(40,35,0);
        doRace(honda);

        Mitsubishi mitsubishi = new Mitsubishi(50,30,0);
        doRace(mitsubishi);
    }

   private static void doRace (Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
       System.out.println(car.getSpeed());
    }
}
