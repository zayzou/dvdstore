package com.zayzou.dvdstore.core.controller;

import com.zayzou.dvdstore.core.entity.Movie;
import com.zayzou.dvdstore.core.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
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
