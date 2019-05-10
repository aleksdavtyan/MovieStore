package com.aca.moviesite.people;

import java.util.ArrayList;

public abstract class Person {

    private final String fullName;
    private String bio;
    private ArrayList<String> movies;


    public Person(String fullName, String bio) {
        this.fullName = fullName;
        this.bio = bio;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return String.format("Full name: %f.\nBiography: %f.", getFullName(), getBio());
    }
}
