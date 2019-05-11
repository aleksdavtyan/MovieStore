package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

import java.util.ArrayList;

public class Fantasy extends Movie {
    private static final String GENRE = "Fantasy";
    public ArrayList<Integer> rating = new ArrayList<Integer>();

    public Fantasy(String title, String description, String premiereDate, Person[] people) {
        super(title, description, premiereDate, Genre.FANTASY, people);
    }

    @Override
    public String toString() {return "Action: " + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
