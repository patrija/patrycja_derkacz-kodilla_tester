package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Honda> cars = new ArrayList<>();
        cars.add(new Honda(40, 20, 100));
        cars.add(new Honda(50, 30, 80));
        Honda honda3 = new Honda(20,10,50);
        cars.add(honda3);
        cars.add(new Honda(35,10,90));

        for(Honda honda : cars) {
            CarUtils.describeCar(honda);
        }
        System.out.println("Po usunieciu");
        cars.remove(0);
        cars.remove(honda3);


        for(Honda honda : cars) {
            CarUtils.describeCar(honda);
        }

        System.out.println(cars.size());
    }
}
