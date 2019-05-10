package com.aca.moviesite.datebase;

import java.util.HashMap;


public class UserDB {

    private static int id;
    public static HashMap<String, String> users = new HashMap<>();

    public static void incrementId() {
        id++;
    }
}
