package org.example.util;

import org.example.model.Flight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {

    public static List<Flight> readFile(){
        File file = new File("C:\\Users\\coshq\\Desktop\\Java\\projects\\StepProjectBooking1\\docs\\flights.json");
        String str ="";
        ArrayList<Flight> flights = new ArrayList<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                str = str + sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String[] individuals = str.split("\\},\\s*\\{");
        for (String individual : individuals) {
            String[] fields = individual.replaceAll("\\{|\\}", "").split(",\\s*");
            String flightNumber = fields[0].split(":")[1].replaceAll("\"", "").trim();
            String airline = fields[1].split(":")[1].replaceAll("\"", "").trim();
            String destination = fields[2].split(":")[1].replaceAll("\"", "").trim();
            String departureCity = fields[3].split(":")[1].replaceAll("\"", "").trim();
            String departureTime = fields[4].split(":")[1].replaceAll("\"", "").trim();
            String arrivalTime = fields[5].split(":")[1].replaceAll("\"", "").trim();
            String gate = fields[6].split(":")[1].replaceAll("\"", "").trim();
            String gateterminal = fields[7].split(":")[1].replaceAll("\"", "").trim();
            String status = fields[8].split(":")[1].replaceAll("\"", "").trim();
            String checkInCounter = fields[9].split(":")[1].replaceAll("\"", "").trim();
            String boardingTime = fields[10].split(":")[1].replaceAll("\"", "").trim();
            flights.add(new Flight(flightNumber, airline, destination, departureCity, departureTime, arrivalTime, gate, gateterminal, status, checkInCounter, boardingTime));
        }
        return flights;
    }
}
