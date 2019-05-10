package com.aca.moviesite.people;

import java.util.ArrayList;

public class Writer extends Person {

    public Writer(String fullName, String bio) {
        super(fullName, bio);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public String getBio() {
        return super.getBio();
    }

    @Override
    public ArrayList<String> getMovies() {
        return super.getMovies();
    }

    @Override
    public String toString() {
        return "Writer " + super.toString();
    }
}
