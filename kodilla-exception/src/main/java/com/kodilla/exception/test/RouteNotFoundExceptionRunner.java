package com.kodilla.exception.test;

import java.util.Map;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightSearch flightFinder = new FlightSearch();

        Flight[] flights = {
                new Flight("Warsaw", "Paris"),
                new Flight("Warsaw", "Moscow"),
                new Flight("Moscow", "Cracow"),
                new Flight("Tokyo", "Paris")
        };

        for (Flight flight : flights) {
            try {
                flightFinder.findFlight(flight);
            } catch (RouteNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
