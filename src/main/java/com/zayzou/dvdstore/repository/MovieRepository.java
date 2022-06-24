package com.zayzou.dvdstore.repository;

import com.zayzou.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryInterface{

    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie " + movie.getTitle() + " has been added.");
    }
}
