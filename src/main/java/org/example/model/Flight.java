package org.example.model;

public class Flight {
    String flightNumber;
    String airline;
    String destination;
    String departureCity;
    String departureTime;
    String arrivalTime;
    String gate;
    String terminal;
    String status;
    String checkInCounter;
    String boardingTime;

    public Flight() {
    }

    public Flight(String flightNumber, String airline, String destination, String departureCity, String departureTime,
                  String arrivalTime, String gate, String terminal, String status, String checkInCounter, String boardingTime) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.destination = destination;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gate = gate;
        this.terminal = terminal;
        this.status = status;
        this.checkInCounter = checkInCounter;
        this.boardingTime = boardingTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getGate() {
        return gate;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getStatus() {
        return status;
    }

    public String getCheckInCounter() {
        return checkInCounter;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airline='" + airline + '\'' +
                ", destination='" + destination + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", gate='" + gate + '\'' +
                ", terminal='" + terminal + '\'' +
                ", status='" + status + '\'' +
                ", checkInCounter='" + checkInCounter + '\'' +
                ", boardingTime='" + boardingTime + '\'' +
                '}'+'\n';
    }
}
