package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Mitsubishi;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];
        for (int n=0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars){
            CarUtils.describeCar(car);
        }
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int speedUp = random.nextInt(11) ;
        int speedDown;
        int actualSpeed;
        if(drawnCarKind == 0)
            return new Ford(speedUp, 20, 100);
        if(drawnCarKind == 1)
            return new Honda(speedUp, 35, 100);
        else
            return new Mitsubishi(speedUp,50, 100);
    }
}
