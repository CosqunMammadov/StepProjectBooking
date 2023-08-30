package org.example.model;

public class Booking {
    int id;
    String flightNumber;
    String passengerName;
    String passengerSurname;
    int userId;

    public Booking(int id, String flightNumber, String passengerName, String passengerSurname, int userId) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", passengerSurname='" + passengerSurname + '\'' +
                '}'+"\n";
    }
}
