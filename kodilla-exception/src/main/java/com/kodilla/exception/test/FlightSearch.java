package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private final Map<String, Boolean> airports = new HashMap<>(); // declare map as a class field

    public FlightSearch() { // initialize map in the constructor
        airports.put("Warsaw", true);
        airports.put("New York", false);
        airports.put("Paris", true);
        airports.put("London", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        boolean arrivalAirportFound = airports.containsKey(flight.getArrivalAirport());
        boolean departureAirportFound = airports.containsKey(flight.getDepartureAirport());

        if (!arrivalAirportFound) {
            throw new RouteNotFoundException("Arrival airport for flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " not found.");
        }

        if (!departureAirportFound) {
            throw new RouteNotFoundException("Departure airport for flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " not found.");
        }

        System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " found.");
    }
}