package org.example;

import org.example.controller.*;

public class Commands {

    public void onlineBoard(){
        OnlineBoardController.onlineBoard();
    }

    public void showFlight(){
        FlightController.showFlight();
    }

    public void searchAndBook(){
        BookingController.searchAndBook();
    }

    public void cancelBook(){
        BookingController.cancelBook();
    }

    public void myFlights(){
        FlightController.myFlights();
    }

}
