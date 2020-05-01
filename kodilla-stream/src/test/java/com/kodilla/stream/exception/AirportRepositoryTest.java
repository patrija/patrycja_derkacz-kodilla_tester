package com.kodilla.stream.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTest {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();

        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");

        assertTrue(isWarsawInUse);

    }

    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();

        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");

        assertFalse(isWarsawInUse);

    }

}