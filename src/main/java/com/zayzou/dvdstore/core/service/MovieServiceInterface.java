package com.zayzou.dvdstore.core.service;

import com.zayzou.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    Movie registerMovie(Movie movie);

    List<Movie> getMovieList();

    Movie getMovieById(Long id);
}
