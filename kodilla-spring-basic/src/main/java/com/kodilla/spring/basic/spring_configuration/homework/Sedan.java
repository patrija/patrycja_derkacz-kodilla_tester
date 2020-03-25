package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car {

    public boolean hasHeadlightsTurnedOn(LocalTime hour) {
        if(hour.isAfter(LocalTime.of(20,00)) || (hour.isBefore(LocalTime.of(6,00)))) {
            return true;
        }
        else return false;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
