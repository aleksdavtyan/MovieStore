package com.aca.moviedb.movie;

import com.aca.moviedb.people.Person;
import sun.util.resources.LocaleData;

import java.util.ArrayList;


public abstract class Movie {
    protected String title;
    protected String description;
    protected LocaleData premiereDate;
    protected String genre;

    private double initialRating;
    public ArrayList<Integer> rating;
    private Person[] people;

    public Movie() {
    }

    public Movie(String title, String description, LocaleData premiereDate, String genre) {
        this.title = title;
        this.description = description;
        this.premiereDate = premiereDate;
        this.initialRating = 0;
        this.genre = genre;
    }

    public String getTitle() {  return title;  }

    public String getDescription() {  return description;
    }

    public String getPremiereDate() {  return title;
    }

    public String getGenre() {  return title;
    }

    public double getRating() { return initialRating;
    }

    public double currentRating() {
        double calcRating;
        double sum = 0;
        for (int i = 0; i < this.rating.size() ; i++) {
            sum += this.rating.get(i);
        }
        calcRating = sum/(this.rating.size());
        return calcRating;
    }

    @Override
    public String toString() {
        return String.format("Movie title: %f.\nRating: %f.\nGenre: %f. \nPremiere date: %f.\nDescription: %f.", title, rating, genre, premiereDate, description);
    }
}
