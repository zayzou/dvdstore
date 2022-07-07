package com.zayzou.dvdstore.core.repository;

import com.zayzou.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    Movie add(Movie movie);

    List<Movie> list();

    Movie getById(Long id);
}
