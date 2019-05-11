package com.aca.moviesite.user;

import com.aca.moviesite.datebase.UserDB;
import com.aca.moviesite.movie.Movie;

public abstract class User {

    private static int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        id++;
    }

    public User(){}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static int getId() { return id; }

    public boolean signIn(User user) {
        if (UserDB.users.containsKey(user.getUsername()) && UserDB.users.containsValue(user.getPassword())) {
            return true;
        }
        return false;
    }

    public abstract void rateMovie(Movie movie, Integer rateNumber);

    public abstract String searchMovie(String movieTitle);

}
