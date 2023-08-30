package org.example.controller;

import org.example.model.Flight;
import org.example.service.FlightService;

import java.util.List;

public class OnlineBoardController {
    FlightService flightService = new FlightService();
    public void onlineBoard(){
        List<Flight> flights = flightService.getFlights();
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            System.out.printf("%s. Flight number: %s, Destination: %s, Departure time: %s, Status: %s \n", i,
                    flight.getFlightNumber(), flight.getDestination(), flight.getDepartureTime(), flight.getStatus());
        }
    }
}
