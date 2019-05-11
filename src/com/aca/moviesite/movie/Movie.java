package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

import java.util.ArrayList;


public abstract class Movie {
    protected String title;
    protected String description;
    protected String premiereDate;
    protected String genre;

    public static ArrayList<Integer> rating = new ArrayList<Integer>();
//    private final double INIT_RATING = 0;
    private Person[] people;


    public Movie(String title, String description, String premiereDate, String genre, Person[] people) {
        this.title = title;
        this.description = description;
        this.premiereDate = premiereDate;
        this.genre = genre;
        this.people = people;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPremiereDate() {
        return title;
    }

    public String getGenre() {
        return title;
    }

    public double currentRating() {
        double calculatedRating;
        double sum = 0;
        for (int i = 0; i < this.rating.size(); i++) {
            sum += this.rating.get(i);
        }
        calculatedRating = sum / (this.rating.size());
        return calculatedRating;
    }

//
//    @Override
//    public String toString() {
//        return String.format("Movie title: %f.\nRating: %f.\nGenre: %f.\nPremiere date: %f.\nDescription: %f.\nPeople: %f", getTitle(), currentRating(), getGenre(), getPremiereDate(), getDescription());
//    }

}
