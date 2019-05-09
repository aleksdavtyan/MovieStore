package com.aca.moviesite;

import com.aca.moviesite.movie.*;
import com.aca.moviesite.user.Admin;
import com.aca.moviesite.user.User;

public class Main {
    public static void main(String[] args) {

        //Movie[] movies = new Movie[6];
        Movie action = new Action("Captian Marvel", "Captain Marvel is an extraterrestrial...", "2019-02-27");
        Movie comedy = new Comedy("The Mask","Whe bank clerk discovers a magical mask", "1994-07-28");
        Movie crime = new Crime("The Godfather", "Widely regarded as one of the greatest films of all time.", "1972-03-25");
        Movie drama = new Drama("Spotlight", "In 2001, editor Marty Baron.", "2015-09-14");

        System.out.println();

        User admin = new Admin("admin", "admin");

        ((Admin) admin).registerUser(admin);
        System.out.println(admin.signIn(admin));

    }
}
