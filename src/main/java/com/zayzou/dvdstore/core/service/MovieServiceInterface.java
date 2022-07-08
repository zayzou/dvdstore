package com.zayzou.dvdstore.core.service;

import com.zayzou.dvdstore.core.entity.Movie;

import java.util.Optional;

public interface MovieServiceInterface {

    Movie registerMovie(Movie movie);

    Iterable<Movie> getMovieList();

    Optional<Movie> getMovieById(Long id);
}
