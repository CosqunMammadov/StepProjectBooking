package org.example.service;

import org.example.dao.FlightRepo;
import org.example.model.Flight;

import java.util.LinkedList;
import java.util.List;

public class FlightService {
    FlightRepo flightRepo = new FlightRepo();

    public void insertFlights(List<Flight> flights){
        for (int i = 0; i < flights.size(); i++) {
            flightRepo.insertFlight(flights.get(i));
        }
    }

    public List<Flight> getFlights(){
        return flightRepo.getFlights();
    }

    public Flight getFlight(String flightNumber){
        return flightRepo.getFlight(flightNumber);
    }

    public List<Flight> searchFlights(String destination, String date){
        List<Flight> flights = getFlights();
        List<Flight> foundFlights = new LinkedList<>();
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            if (flight.getDestination().equals(destination) && flight.getDepartureTime().equals(date))
                foundFlights.add(flight);
        }
        return foundFlights;
    }
}
