package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

import java.util.ArrayList;

public class Crime extends Movie {

    private static final String GENRE = "Crime";
    public ArrayList<Integer> rating = new ArrayList<Integer>();

    public Crime(String title, String description, String premiereDate, Person[] people) {
        super(title, description, premiereDate, Genre.CRIME, people);
    }

    @Override
    public String toString() {return "|Crime|\n" + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
