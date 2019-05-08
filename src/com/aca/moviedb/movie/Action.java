package com.aca.moviedb.movie;

import com.aca.moviedb.people.Person;
import sun.util.resources.LocaleData;

public class Action extends Movie {
    private String title;
    private String description;
    private LocaleData premiereDate;
    private static final String GENRE = "Action";

    private double rating;
    private Person[] people;

    public Action(String title, String description, LocaleData premiereDate) {
            super(title, description, premiereDate, GENRE);
    }

    @Override
    public String toString() {return "Action: " + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
