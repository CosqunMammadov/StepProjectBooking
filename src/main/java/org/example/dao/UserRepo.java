package org.example.dao;

import org.example.constants.Sql;
import org.example.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepo {

    public User getUser(String inputUsername, String inputPassword){
        User user = null;
        PreparedStatement ps = Db.getStatement(String.format(Sql.SELECT_USER.getStmt(), inputUsername, inputPassword));
        try {
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                user = new User(id, username, password);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
