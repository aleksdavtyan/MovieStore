package com.aca.moviesite;

import com.aca.moviesite.datebase.MovieDB;
import com.aca.moviesite.datebase.UserDB;
import com.aca.moviesite.movie.*;
import com.aca.moviesite.people.Actor;
import com.aca.moviesite.people.Director;
import com.aca.moviesite.people.Person;
import com.aca.moviesite.people.Writer;
import com.aca.moviesite.ui.CommandLineUserInterface;
import com.aca.moviesite.user.Admin;
import com.aca.moviesite.user.StandardUser;

public class MovieStore {
    private static final Admin admin = new Admin("admin", "admin");
    private static final StandardUser user1 = new StandardUser("user1", "user111");
    private static final StandardUser user2 = new StandardUser("user2", "user222");
    private static CommandLineUserInterface commandLineUserInterface = new CommandLineUserInterface();

    public static void startMovieStore() {

        Person[] people = {new Director("John Smith", "John Smith was born in 1965"), new Writer("George Clooney", "George is an American actor, filmmaker"), new Actor("Brad Pitt", "Brad Pitt was corn in 1963..")};
        Person[] people1 = {new Director("Sylvester Stallone", "Sylvester was born in 1975"), new Writer("Katie Holmes", "Katie is an American actress, filmmaker"), new Actor("Pitt", "Brad Pitt was corn in 1933.")};
        Person[] people2 = {new Director("Steven Seagal", "Steven was born in 1974"), new Writer("Angelina Jolie", "Jolie is an American actress, filmmaker, and humanitarian."), new Actor("John Smith", "John was born in 1919")};


        Movie theAlgorithm = new Action("The Algorithm", "The Algorithm is an extraterrestrial...", "2019-02-27", people);
        Movie theMask = new Comedy("The Mask", "When bank clerk discovers a magical mask", "1994-07-28", people1);
        Movie theGodfather = new Crime("The Godfather", "Widely regarded as one of the greatest films of all time.", "1972-03-25", people2);
        Movie spotlight = new Drama("Spotlight", "In 2001, editor Marty Baron.", "2015-09-14", people);

        admin.registerUser(admin);

        if (admin.signIn(admin)) {
            Admin.addMovie(theAlgorithm);
            Admin.addMovie(theMask);
            Admin.addMovie(theGodfather);
            Admin.addMovie(spotlight);
        }

        if (user1.signUp(user1)) {
            user1.signIn(user1);
            user1.rateMovie(theAlgorithm, 10);
            user1.rateMovie(theMask,9);
            user1.rateMovie(theGodfather,7);
            user1.rateMovie(spotlight, 6);
        }

        if (user2.signUp(user2)) {
            user2.signIn(user2);
            user2.rateMovie(theAlgorithm, 7);
            user2.rateMovie(theMask,5);
            user2.rateMovie(theGodfather,8);
        }

        for (Movie movie : MovieDB.getInstance().movies) {
            System.out.println(movie);
        }
        String searchResult = user1.searchMovie("The Mask");
        commandLineUserInterface.output("The result of \"The Mask\" search is " + searchResult);

        commandLineUserInterface.output(String.format("The rating of The Algorithm = %f", theAlgorithm.currentRating()));
        commandLineUserInterface.output(String.format("The rating of The Mask = %f", theMask.currentRating()));
        commandLineUserInterface.output(String.format("The rating of The Godfather = %f", theGodfather.currentRating()));

        commandLineUserInterface.output("Number of users in the Database = " + UserDB.getInstance().getId());
        commandLineUserInterface.output("Number of movies in the Database = " + MovieDB.getInstance().getId());

    }
}
