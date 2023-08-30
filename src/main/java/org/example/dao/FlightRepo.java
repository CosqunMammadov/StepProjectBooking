package org.example.dao;

import org.example.constants.Sql;
import org.example.model.Flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class FlightRepo {

    public void insertFlight(Flight flight){
        PreparedStatement ps;
            ps = Db.getStatement(String.format(Sql.INSERT_FLIGHT.getStmt(),
                    flight.getFlightNumber(),
                    flight.getAirline(),
                    flight.getDestination(),
                    flight.getDepartureCity(),
                    flight.getDepartureTime(),
                    flight.getArrivalTime(),
                    flight.getGate(),
                    flight.getTerminal(),
                    flight.getStatus(),
                    flight.getCheckInCounter(),
                    flight.getBoardingTime()));
        try {
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Flight> getFlights(){
        PreparedStatement ps = Db.getStatement(Sql.SELECT_FLIGHTS.getStmt());
        ResultSet rs;
        List<Flight> flights = new LinkedList<>();
        try {
             rs = ps.executeQuery();
             while (rs.next()){
                 String flightNumber = rs.getString("flight_number");
                 String airLine = rs.getString("air_line");
                 String destination = rs.getString("destination");
                 String departureCity = rs.getString("departure_city");
                 String departureTime = rs.getString("departure_time");
                 String arrivalTime = rs.getString("arrival_time");
                 String gate = rs.getString("gate");
                 String terminal = rs.getString("terminal");
                 String status = rs.getString("status");
                 String checkInCounter = rs.getString("check_in_counter");
                 String boardingTime = rs.getString("boarding_time");

                 flights.add(new Flight(flightNumber, airLine, destination, departureCity, departureTime, arrivalTime, gate, terminal, status, checkInCounter, boardingTime));
             }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flights;
    }

    public Flight getFlight(String inputFlightNumber){
        PreparedStatement ps = Db.getStatement(String.format(Sql.SELECT_FLIGHT.getStmt(), inputFlightNumber));
        Flight flight = null;
        try {
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String flightNumber = rs.getString("flight_number");
                String airLine = rs.getString("air_line");
                String destination = rs.getString("destination");
                String departureCity = rs.getString("departure_city");
                String departureTime = rs.getString("departure_time");
                String arrivalTime = rs.getString("arrival_time");
                String gate = rs.getString("gate");
                String terminal = rs.getString("terminal");
                String status = rs.getString("status");
                String checkInCounter = rs.getString("check_in_counter");
                String boardingTime = rs.getString("boarding_time");
                flight = new Flight(flightNumber, airLine, destination, departureCity, departureTime, arrivalTime, gate, terminal, status, checkInCounter, boardingTime);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flight;
    }

}
