package com.aca.moviesite.user;

import com.aca.moviesite.datebase.MovieDB;
import com.aca.moviesite.datebase.UserDB;
import com.aca.moviesite.movie.Movie;

public class StandardUser extends User {

    private static int id;
    Admin admin = new Admin();


    public StandardUser(String username, String password) {
        super(username, password);
        id = User.getId();
    }

    public boolean signUp(User user) {
        if (!UserDB.getInstance().users.containsKey(user.getUsername())) {
            admin.registerUser(user);
            return true;
        }else return false;
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
        if (!movie.equals(null) && rateNumber >= 1 && rateNumber <= 10)
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
