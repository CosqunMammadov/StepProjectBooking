package org.example;

import org.example.controller.*;

public class Commands {

    public void onlineBoard(){
        OnlineBoardController.onlineBoard();
    }

    public void showFlight(){
        FlightInfoController.showFlight();
    }

    public void searchAndBook(){
        SearchAndBookController.searchAndBook();
    }

    public void cancelBook(){
        CancelBookController.cancelBook();
    }

    public void myFlights(){
        MyFlightsController.myFlights();
    }

}
