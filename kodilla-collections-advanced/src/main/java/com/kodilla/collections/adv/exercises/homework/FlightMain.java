package com.kodilla.collections.adv.exercises.homework;

import java.sql.SQLOutput;

public class FlightMain {
    public static void main(String[] args) {
        FlightFinder finder = new FlightFinder();
        System.out.println(finder.findFlightsFrom("Warsaw"));
        System.out.println(finder.findFlightsTo("Warsaw"));

    }
}
