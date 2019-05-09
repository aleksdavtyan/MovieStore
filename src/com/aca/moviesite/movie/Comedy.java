package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

public class Comedy extends Movie {

    private static final String GENRE = "Comedy";

    private double rating;
    private Person[] people;

    public Comedy(String title, String description, String premiereDate) {
        super(title, description, premiereDate, GENRE);
    }

    @Override
    public String toString() {return "Action: " + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
