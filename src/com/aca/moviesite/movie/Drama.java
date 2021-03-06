package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

import java.util.ArrayList;

public class Drama extends Movie {

    public ArrayList<Integer> rating = new ArrayList<Integer>();

    public Drama(String title, String description, String premiereDate, Person[] people) {
        super(title, description, premiereDate, Genre.DRAMA, people);
    }

    @Override
    public String toString() {return "|Drama|\n" + super.toString(); }

    @Override
    public double currentRating() {
        return super.currentRating();
    }
}
