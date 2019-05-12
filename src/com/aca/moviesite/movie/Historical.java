package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

import java.util.ArrayList;

public class Historical extends Movie {

    public ArrayList<Integer> rating = new ArrayList<Integer>();

    public Historical(String title, String description, String premiereDate, Person[] people) {
        super(title, description, premiereDate, Genre.HISTORICAL, people);
    }

    @Override
    public String toString() {return "|Historical|\n" + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
