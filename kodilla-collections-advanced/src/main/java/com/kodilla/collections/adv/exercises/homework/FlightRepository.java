package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;

import java.util.List;

public class FlightRepository {


    public  List<Flight> getFlightTable() {
        List<Flight> flightTable = new ArrayList<>();
        flightTable.add(new Flight("Warsaw", "Oslo"));
        flightTable.add(new Flight("Oslo", "Berlin"));
        flightTable.add(new Flight("Paris", "Barcelona"));
        flightTable.add(new Flight("Barcelona", "Rome"));
        flightTable.add(new Flight("Barcelona", "Warsaw"));
        return flightTable;
    }




}
