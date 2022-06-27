package com.zayzou.dvdstore.core.service;

import com.zayzou.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    void registerMovie(Movie movie);

    List<Movie> getMovieList();

    Movie getMovieById(Long id);
}
