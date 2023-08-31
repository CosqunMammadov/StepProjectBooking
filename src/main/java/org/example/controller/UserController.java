package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.example.util.ScannerUtil;

import java.util.Scanner;

public class UserController {
    ScannerUtil scannerUtil = new ScannerUtil();
    UserService userService = new UserService();

    public void logIn(){
        userService.logIn();
    }
}
