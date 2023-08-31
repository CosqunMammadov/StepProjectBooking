package org.example.service;

import org.example.dao.UserRepo;
import org.example.model.User;
import org.example.util.ScannerUtil;

public class UserService {
    UserRepo userRepo = new UserRepo();
    ScannerUtil scannerUtil = new ScannerUtil();

    public static int currentUserId;

    public void logIn(){
        while (true) {
            User loginInfo = scannerUtil.getLoginInfo();
            User user =  userRepo.getUser(loginInfo.getUsername(), loginInfo.getPassword());
            if (user != null){
                currentUserId = user.getId();
                break;
            }
        }
    }
}
