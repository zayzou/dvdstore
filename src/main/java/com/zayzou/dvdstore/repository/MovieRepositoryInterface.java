package com.zayzou.dvdstore.repository;

import com.zayzou.dvdstore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    void add(Movie movie);

    List<Movie> list();
}
