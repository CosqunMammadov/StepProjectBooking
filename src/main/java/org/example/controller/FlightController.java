package org.example.controller;

import org.example.model.Flight;
import org.example.service.FlightService;
import org.example.util.FileUtil;
import org.example.util.ScannerUtil;

import java.util.List;
import java.util.Scanner;


public class FlightController {
    FlightService flightService = new FlightService();
    ScannerUtil scannerUtil = new ScannerUtil();
    public void insertFlights(){
        flightService.insertFlights(FileUtil.readFile());
    }

    public void onlineBoard(){
        List<Flight> flights = flightService.getFlights();
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            System.out.printf("%s. Flight number: %s, Destination: %s, Departure time: %s, Status: %s \n", i,
                    flight.getFlightNumber(), flight.getDestination(), flight.getDepartureTime(), flight.getStatus());
        }
    }

    public void showTheFlightInfo(){
        System.out.println("Write flight number: ");
        String flightNumber = scannerUtil.getString();
        Flight flight = flightService.getFlight(flightNumber);
        System.out.println(flight);
    }
}
