package com.zayzou.dvdstore.controller;

import com.zayzou.dvdstore.entity.Movie;
import com.zayzou.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {

    @Autowired //no need to getter and setter
    private MovieServiceInterface movieService;

    public void addUsingConsole() {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎬 Movie title ?");
        String title = sc.nextLine();

        System.out.println("📽  Movie genre ?");
        String genre = sc.nextLine();

        Movie movie = new Movie();
        movie.setGenre(genre);
        movie.setTitle(title);


        movieService.registerMovie(movie);
    }

}
