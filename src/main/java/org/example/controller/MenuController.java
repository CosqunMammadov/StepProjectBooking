package org.example.controller;

import org.example.constants.Command;
import org.example.util.ScannerUtil;

import java.util.Arrays;

public class MenuController {
    UserController userController = new UserController();
    ScannerUtil scannerUtil = new ScannerUtil();
    OnlineBoardController onlineBoardController = new OnlineBoardController();
    FlightController flightController = new FlightController();
    BookingController bookingController = new BookingController();

    public void startApp(){
//        flightController.insertFlights();
        boolean flag = true;
        while (flag) {
            userController.logIn();
            while (true) {
                showCommands();
                String command = scannerUtil.getCommand();
                if (command.equalsIgnoreCase("ONLINE_BOARD"))
                    onlineBoardController.onlineBoard();
                else if (command.equalsIgnoreCase("SHOW_THE_FLIGHT_INFO"))
                    flightController.showTheFlightInfo();
                else if (command.equalsIgnoreCase("SEARCH_AND_BOOK"))
                    bookingController.searchAndBookFlight();
                else if (command.equalsIgnoreCase("CANCEL_THE_BOOKING"))
                    bookingController.cancelTheBooking();
                else if (command.equalsIgnoreCase("MY_BOOKINGS"))
                    bookingController.myBookings();
                else if (command.equalsIgnoreCase("END_SESSION"))
                    break;
                else if (command.equalsIgnoreCase("EXIT")) {
                    flag = false;
                    break;
                }else System.out.println("Type the command correctly!");
            }
        }
    }
    private void showCommands() {
        System.out.println("Write one of the commands!");
        System.out.println("*************");
        Arrays.stream(Command.values())
                .forEach(it -> System.out.println(it));
        System.out.println("*************");
    }
}
