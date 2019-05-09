package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

public class Drama extends Movie {

    private static final String GENRE = "Drama";
    private double rating;
    private Person[] people;

    public Drama(String title, String description, String premiereDate) {
        super(title, description, premiereDate, GENRE);
    }

    @Override
    public String toString() {return "Action: " + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
