package org.example.service;

import org.example.dao.UserRepo;
import org.example.model.User;

public class UserService {
    UserRepo userRepo = new UserRepo();

    public User getUser(String username, String password){
        return userRepo.getUser(username, password);
    }
}
