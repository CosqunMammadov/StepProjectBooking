package org.example.controller;

import org.example.flightAndBooking.Flight;

import java.util.List;

public class FlightController {
private List<Flight> flights;

    public FlightController(List<Flight> flights) {
        this.flights = flights;
    }
   public List<Flight> getFlights(){
        return flights;
   }

   public Flight getFlightById(int id) {
       for (Flight flight : flights) {
           if (flight.getId() == id) {
               return flight;
           }
       }

       return null;
   }

   public boolean bookFlight(int id, int requiredSeats){
        Flight flight=getFlightById(id);
        if(flight!=null& flight.getSeats()>=requiredSeats){
            flight.setSeats( flight.getSeats()-requiredSeats);
            return true;
        }
        return false;
   }

    public boolean cancelBooking(int id, int numSeats) {
        Flight flight = getFlightById(id);
        if (flight != null && flight.getSeats() + numSeats <= flight.getTotalSeats()) {
            // Update flight seats and perform cancellation logic
            flight.setSeats(flight.getSeats() + numSeats);
            return true;
        }
        return false; // Cancellation failed
    }

    public static void showFlight(){

    }

    public static void myFlights(){

    }


}
