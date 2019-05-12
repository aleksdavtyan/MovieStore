package com.aca.moviesite.datebase;

import com.aca.moviesite.movie.Movie;

import java.util.ArrayList;

public class MovieDB {

    private int id;

    public ArrayList<Movie> movies = new ArrayList<>();

    private static MovieDB movieDB = new MovieDB();

    public MovieDB() {}

    public static MovieDB getInstance() {  return movieDB;  }

    public void incrementId() {  id++;  }

    public int getId() {
        return id;
    }
}
