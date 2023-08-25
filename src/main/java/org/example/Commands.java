package org.example;

import org.example.controller.*;

public class Commands {

    public void onlineBoard(){
        OnlineBoard.onlineBoard();
    }

    public void showFlight(){
        FlightInfo.showFlight();
    }

    public void searchAndBook(){
        SearchAndBook.searchAndBook();
    }

    public void cancelBook(){
        CancelBook.cancelBook();
    }

    public void myFlights(){
        MyFlights.myFlights();
    }

}
