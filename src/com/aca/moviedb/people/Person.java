package com.aca.moviedb.people;

import sun.util.resources.LocaleData;

import java.util.ArrayList;

public abstract class Person {

    private final String fullName;
    private final LocaleData birthDate;
    private String bio;

    private ArrayList<String> movies;

    public Person(String fullName, LocaleData birthDate, String bio) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.bio = bio;
    }
}
