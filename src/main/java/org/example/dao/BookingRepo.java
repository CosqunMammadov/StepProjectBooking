package org.example.dao;

import org.example.constants.Sql;
import org.example.model.Booking;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class BookingRepo {

    public void insertBooking(Booking booking){
        PreparedStatement ps = Db.getStatement(String.format(Sql.INSERT_BOOKING.getStmt(),
                booking.getPassengerName(), booking.getPassengerSurname(), booking.getFlightNumber(), booking.getUserId()));

        try {
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBooking(int bookingId){
        PreparedStatement ps = Db.getStatement(String.format(Sql.DELETE_BOOKING.getStmt(), bookingId));
        try {
            ps.executeUpdate();
            System.out.println("Booking is deleted.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Booking> getUserBookings(int id){
        List<Booking> bookings = new LinkedList<>();
        PreparedStatement ps = Db.getStatement(String.format(Sql.SELECT_USER_BOOKINGS.getStmt(), id));
        try {
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int bookingId = rs.getInt("id");
                String passengerName = rs.getString("passenger_name");
                String passengerSurname = rs.getString("passenger_surname");
                String flightNumber = rs.getString("flight_number");
                int userId = rs.getInt("user_id");
                bookings.add(new Booking(bookingId, flightNumber,passengerName, passengerSurname, userId));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookings;
    }
}
