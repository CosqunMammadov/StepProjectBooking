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

    public void showTheFlightInfo(){
        System.out.println("Write flight number: ");
        String flightNumber = scannerUtil.getString();
        Flight flight = flightService.getFlight(flightNumber);
        if (flight != null)
            System.out.println(flight);
        else System.out.println("Flight number is not found");
    }
}
