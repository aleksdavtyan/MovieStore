package com.aca.moviedb.user;

import com.aca.moviedb.datebase.MovieDB;
import com.aca.moviedb.movie.Movie;

public abstract class User {

    public static final int MAX_PASSWORD_LENGHT = 10;

    private String username;
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public abstract boolean registration(User user);

    public abstract boolean login(User user);

    public abstract void rateMovie(Movie movie);

    public String searchMovie(String title) {
        for (Movie movie : MovieDB.movies) {
            if (movie.getTitle().equals(title)) {
                return movie.toString();
            }
        }
    }

}
