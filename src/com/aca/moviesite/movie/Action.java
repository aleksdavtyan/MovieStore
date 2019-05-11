package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

import java.util.ArrayList;

public class Action extends Movie {

    private static final String GENRE = "Action";
    public ArrayList<Integer> rating = new ArrayList<Integer>();

    public Action(String title, String description, String premiereDate, Person[] people) {
            super(title, description, premiereDate, GENRE, people);
    }

    @Override
    public String toString() {return "Action: " + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
