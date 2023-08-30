package org.example.controller;

import org.example.model.Flight;
import org.example.service.BookingService;
import org.example.service.FlightService;
import org.example.util.ScannerUtil;

import java.util.List;
import java.util.Scanner;

public class BookingController {

    ScannerUtil scannerUtil = new ScannerUtil();
    BookingService bookingService = new BookingService();
    FlightService flightService = new FlightService();

    public void searchAndBookFlight(){
       List<String> searchData = scannerUtil.getSearchData();
        List<Flight> flights = flightService.searchFlights(searchData.get(0), searchData.get(1));
        System.out.println(flights);

        bookingService.getBookFlights(searchData.get(3), UserController.currentUserId, Integer.parseInt(searchData.get(2)));
    }

    public void cancelTheBooking(){
        System.out.println("Write booking id: ");
        int id = scannerUtil.getInt();
        bookingService.deleteBooking(id);
    }

    public void myBookings(){
        System.out.println(bookingService.getUserBookings(UserController.currentUserId));
    }
}
