package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;
import org.example.util.ScannerUtil;

import java.util.Scanner;

public class UserController {
    ScannerUtil scannerUtil = new ScannerUtil();
    UserService userService = new UserService();
    public static int currentUserId;

    public void logIn(){

        while (true) {
            User loginInfo = scannerUtil.getLoginInfo();
            User user = userService.getUser(loginInfo.getUsername(), loginInfo.getPassword());
            if (user != null){
                currentUserId = user.getId();
                break;
            }
        }
    }
}
