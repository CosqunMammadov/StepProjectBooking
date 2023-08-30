package org.example.service;

import org.example.dao.BookingRepo;
import org.example.model.Booking;
import org.example.util.ScannerUtil;

import java.util.LinkedList;
import java.util.List;


public class BookingService {
    BookingRepo bookingRepo = new BookingRepo();
    ScannerUtil scannerUtil = new ScannerUtil();

    public void getBookFlights(String flightNumber, int userId, int numberOfTickets){
        for (int i = 0; i < numberOfTickets; i++) {
            List<String> fullName = scannerUtil.getFullName();
            bookingRepo.insertBooking(new Booking(0, flightNumber, fullName.get(0), fullName.get(1), userId));
        }
    }

    public void deleteBooking(int bookingId){
        bookingRepo.deleteBooking(bookingId);
    }

    public List<Booking> getUserBookings(int id){
        return bookingRepo.getUserBookings(id);
    }
}
