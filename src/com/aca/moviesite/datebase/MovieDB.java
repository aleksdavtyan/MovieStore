package com.aca.moviesite.datebase;

import com.aca.moviesite.movie.Movie;

import java.util.ArrayList;

public class MovieDB {

    private static int id;

    public static ArrayList<Movie> movies = new ArrayList<>();

    public static void incrementId() {
        id++;
    }

}
