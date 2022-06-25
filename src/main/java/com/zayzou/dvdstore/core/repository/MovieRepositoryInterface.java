package com.zayzou.dvdstore.core.repository;

import com.zayzou.dvdstore.core.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    void add(Movie movie);

    List<Movie> list();
}
