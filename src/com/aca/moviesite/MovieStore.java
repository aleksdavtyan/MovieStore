package com.aca.moviesite;

import com.aca.moviesite.datebase.MovieDB;
import com.aca.moviesite.movie.*;
import com.aca.moviesite.people.Actor;
import com.aca.moviesite.people.Director;
import com.aca.moviesite.people.Person;
import com.aca.moviesite.people.Writer;
import com.aca.moviesite.user.Admin;

public class MovieStore {
    private static final Admin admin = new Admin("admin", "admin");

    public static void startMovieStore() {

        Person[] people = {new Director("John Smith", "John Smith was born in 1965"), new Writer("George Clooney", "George is an American actor, filmmaker"), new Actor("Brad Pitt", "Brad Pitt was corn in 1963..")};
        Person[] people1 = {new Director("Sylvester Stallone", "Sylvester was born in 1975"), new Writer("Katie Holmes", "Katie is an American actress, filmmaker"), new Actor("Pitt", "Brad Pitt was corn in 1933.")};
        Person[] people2 = {new Director("Steven Seagal", "Steven was born in 1974"), new Writer("Angelina Jolie", "Jolie is an American actress, filmmaker, and humanitarian."), new Actor("John Smith", "John was born in 1919")};


        Movie action = new Action("Captain Marvel", "Captain Marvel is an extraterrestrial...", "2019-02-27", people);
        Movie comedy = new Comedy("The Mask", "When bank clerk discovers a magical mask", "1994-07-28", people1);
        Movie crime = new Crime("The Godfather", "Widely regarded as one of the greatest films of all time.", "1972-03-25", people2);
        Movie drama = new Drama("Spotlight", "In 2001, editor Marty Baron.", "2015-09-14", people);

        admin.registerUser(admin);

        if (admin.signIn(admin)) {
            Admin.addMovie(action);
            Admin.addMovie(comedy);
            Admin.addMovie(crime);
            Admin.addMovie(drama);
        }

        for (Movie movie : MovieDB.movies) {
            System.out.println(movie);
        }
    }
}
