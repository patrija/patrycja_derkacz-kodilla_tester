package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightFinder {

   FlightRepository repository = new FlightRepository();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightTable = repository.getFlightTable();
        List<Flight> result = new ArrayList<>();
        for(Flight flightElement : flightTable) {
            if (departure.equals(flightElement.getDeparture())) {
                result.add(flightElement);
            }
        }
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        List<Flight> flightTable = repository.getFlightTable();
        for (Flight flightElement : flightTable) {
            if (arrival.equals(flightElement.getArrival())){
                result.add(flightElement);
            }
        }
        return result;
    }



}
