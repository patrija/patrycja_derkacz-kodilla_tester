package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Mitsubishi;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("------------");
        System.out.println(getCarName(car));
        System.out.print("Increased speed is "); car.increaseSpeed();
        System.out.print("Decreased speed is "); car.decreaseSpeed();
        System.out.println("Car speed is " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if(car instanceof Ford)
            return "Ford";
        else if(car instanceof Honda)
            return "Honda";
        else if(car instanceof Mitsubishi)
            return "Mitsubishi";
        else
            return "unknow car name";
    }
}
