package org.example.util;

import org.example.constants.Command;
import org.example.model.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ScannerUtil {
    Scanner scan = new Scanner(System.in);

    public List<String> getFullName(){
        System.out.println("Write name and surname.");
        String name = scan.next();
        String surname = scan.next();
        List<String> fullName = new LinkedList<>();
        fullName.add(name);
        fullName.add(surname);
        return fullName;
    }

    public String getCommand(){
        String command = scan.next();
        return command;
    }

    public List<String> getSearchData(){
        List<String> list = new LinkedList<>();
        System.out.println("Write destinatin: ");
        String destination = scan.nextLine();
        System.out.println("Write date: ");
        String date = scan.nextLine();
        System.out.println("Write number of people: ");
        String numberOfPeople = scan.next();
        System.out.println("Write flight number: ");
        String flightNumber = scan.next();
        list.add(destination);
        list.add(date);
        list.add(numberOfPeople);
        list.add(flightNumber);
        return list;
    }

    public int getInt(){
        return scan.nextInt();
    }

    public String getString(){
        return scan.next();
    }

    public User getLoginInfo(){
        System.out.println("Write username and password: ");
        User user = new User(scan.next(), scan.next());
        return user;
    }
}
