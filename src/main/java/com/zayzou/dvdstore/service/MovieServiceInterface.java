package com.zayzou.dvdstore.service;

import com.zayzou.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    void registerMovie(Movie movie);

    List<Movie> getMovieList();
}
