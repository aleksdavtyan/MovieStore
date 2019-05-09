package com.aca.moviesite.movie;

import com.aca.moviesite.people.Person;

import java.util.ArrayList;


public abstract class Movie {
    protected String title;
    protected String description;
    protected String premiereDate;
    protected String genre;

    public ArrayList<Integer> rating;
    private final double INIT_RATING = 0;
    private Person[] people;


    public Movie(String title, String description, String premiereDate, String genre) {
        this.title = title;
        this.description = description;
        this.premiereDate = premiereDate;
        this.genre = genre;
    }

    public String getTitle() {  return title;  }

    public String getDescription() {  return description;
    }

    public String getPremiereDate() {  return title;
    }

    public String getGenre() {  return title;
    }

    public double getINIT_RATING() {
        return INIT_RATING;
    }

    public double currentRating() {
        double calculatedRating;
        double sum = 0;
        for (int i = 0; i < this.rating.size() ; i++) {
            sum += this.rating.get(i);
        }
        calculatedRating = sum/(this.rating.size());
        return calculatedRating;
    }

    @Override
    public String toString() {
        return String.format("Movie title: %f.\nRating: %f.\nGenre: %f. \nPremiere date: %f.\nDescription: %f.", title, rating, genre, premiereDate, description);
    }
}
