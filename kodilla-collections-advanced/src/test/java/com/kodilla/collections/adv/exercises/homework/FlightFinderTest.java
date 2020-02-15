package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void findFlightsFromIfExistOneArrival(){
        FlightFinder finder = new FlightFinder();
        List<Flight> result;

        result = finder.findFlightsFrom("Warsaw");

        assertEquals(1,result.size());
        assertEquals("Oslo", result.get(0).getArrival());
    }

    @Test
    public void findFlightsFromIfExistMoreThanOneArrival(){
        FlightFinder finder = new FlightFinder();
        List<Flight> result;

        result = finder.findFlightsFrom("Barcelona");

        assertEquals(2., result.size());
        assertEquals("Rome", result.get(0).getArrival());
        assertEquals("Warsaw", result.get(1).getArrival());
    }
    @Test
    public void findFlightsFromIfDepartureDoNotExist() {
        FlightFinder finder = new FlightFinder();
        List<Flight> result;

        result = finder.findFlightsFrom("Miami");

        assertEquals(0, result.size());
    }

    @Test
    public void findFlightsTo() {
        FlightFinder finder = new FlightFinder();
        List<Flight> result;

        result = finder.findFlightsTo("Rome");

        assertEquals(1, result.size());

    }

}