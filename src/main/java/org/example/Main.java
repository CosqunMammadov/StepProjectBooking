package org.example;

import org.example.controller.FlightController;
import org.example.controller.MenuController;
import org.example.controller.OnlineBoardController;
import org.example.service.FlightService;
import org.example.util.FileUtil;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
//        menuController.startApp();

        FlightController flightController = new FlightController();
        flightController.insertFlights();

    }
}
