package org.example.repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.flightAndBooking.Flight;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

        private List<Flight> flights;

        public void FlightDAO(String jsonFilePath) {
            flights = new ArrayList<>();
            loadFlightsFromJson(jsonFilePath);
        }

        private void loadFlightsFromJson(String jsonFilePath) {
            ObjectMapper objectMapper = new ObjectMapper();

            try {
                JsonNode rootNode = objectMapper.readTree(Paths.get(jsonFilePath).toFile());
                JsonNode jsonFlights = rootNode.get("flights");

                for (JsonNode jsonFlight : jsonFlights) {
                    Flight flight = new Flight(jsonFlight);
                    flights.add(flight);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public List<Flight> getAllFlights() {
            return flights;
        }

        public Flight getFlightByNumber(String flightNumber) {
            for (Flight flight : flights) {
                if (flight.getFlightNumber().equals(flightNumber)) {
                    return flight;
                }
            }
            return null;
        }
    }

