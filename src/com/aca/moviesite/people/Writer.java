package com.aca.moviesite.people;

import sun.util.resources.LocaleData;

import java.util.ArrayList;

public class Writer extends Person {

    public Writer(String fullName, LocaleData birthDate, String bio) {
        super(fullName, birthDate, bio);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public LocaleData getBirthDate() {
        return super.getBirthDate();
    }

    @Override
    public String getBio() {
        return super.getBio();
    }

    @Override
    public ArrayList<String> getMovies() {
        return super.getMovies();
    }
}
