package com.aca.moviesite.user;

import com.aca.moviesite.datebase.MovieDB;
import com.aca.moviesite.datebase.UserDB;
import com.aca.moviesite.movie.Movie;
import com.aca.moviesite.ui.CommandLineUserInterface;

public class Admin extends User {

    CommandLineUserInterface commandLineUserInterface = new CommandLineUserInterface();
    private static int id;


    public Admin() {super();  }

    public Admin(String username, String password) {
        super(username, password);
        id = User.getId();
    }

    public void registerUser(User user) {
        if (!UserDB.users.containsKey(user.getUsername()) && !user.equals(null)) {
            UserDB.users.put(user.getUsername(), user.getPassword());
            UserDB.incrementId();
        } else commandLineUserInterface.output("The username already exists. Please use a different username.");
    }

    public void removeUser(User user) {
        if (UserDB.users.containsKey(user.getUsername())) {
            UserDB.users.remove(user.getUsername());
        } else commandLineUserInterface.output("The user you are trying delete doesn't exist.");
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
    public String searchMovie(Movie movie) {
        for (Movie movie1 : MovieDB.movies) {
            if (movie1.getTitle().equals(movie.getTitle())) {
                return movie.toString();
            }
        }
        return null;
    }

}
