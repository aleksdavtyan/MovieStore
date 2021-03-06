package com.aca.moviesite.user;

import com.aca.moviesite.datebase.MovieDB;
import com.aca.moviesite.datebase.UserDB;
import com.aca.moviesite.movie.Movie;
import com.aca.moviesite.ui.CommandLineUserInterface;

public class Admin extends User {

    CommandLineUserInterface commandLineUserInterface = new CommandLineUserInterface();
    private static int id;


    public Admin() {
        super();
    }

    public Admin(String username, String password) {
        super(username, password);
        id = User.getId();
    }

    public boolean registerUser(User user) {
        if (!user.equals(null) && !UserDB.getInstance().users.containsKey(user.getUsername())) {
            UserDB.getInstance().users.put(user.getUsername(), user.getPassword());
            UserDB.getInstance().incrementId();
            return true;
        } else {
            commandLineUserInterface.output("The username already exists. Please use a different username.");
        }
        return false;
    }

    public void removeUser(User user) {
        if (UserDB.getInstance().users.containsKey(user.getUsername())) {
            UserDB.getInstance().users.remove(user.getUsername());
        } else commandLineUserInterface.output("The user you are trying delete doesn't exist.");
    }

    public static boolean addMovie(Movie movie) {
        if (!movie.equals(null)) {
            MovieDB.getInstance().movies.add(movie);
            MovieDB.getInstance().incrementId();
            return true;
        }
        return false;
    }

    public boolean removeMovie(Movie movie) {
        if (MovieDB.getInstance().movies.contains(movie)) {
            MovieDB.getInstance().movies.remove(movie);
            return true;
        } else commandLineUserInterface.output("The movie you are trying delete doesn't exist.");
        return false;
    }


    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public boolean signIn(User user) {
        return super.signIn(user);
    }

    @Override
    public void rateMovie(Movie movie, Integer rateNumber) {
        if (rateNumber >= 1 && rateNumber <= 10)
            movie.rating.add(rateNumber);
    }

    @Override
    public String searchMovie(String movieTitle) {
        for (Movie movie1 : MovieDB.getInstance().movies) {
            if (movie1.getTitle().equals(movieTitle)) {
                return movie1.toString();
            }
        }
        return null;
    }

}
