package com.aca.moviesite.datebase;

import java.util.HashMap;


public class UserDB {

    private int id;

    public HashMap<String, String> users = new HashMap<>();

    private static final UserDB userDB = new UserDB();

    private UserDB() {}

    public static UserDB getInstance() {
        return userDB;
    }

    public void incrementId() {
        id++;
    }

    public int getId() { return id;  }
}
