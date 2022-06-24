package com.zayzou.dvdstore.service;

import com.zayzou.dvdstore.entity.Movie;
import com.zayzou.dvdstore.repository.MovieRepositoryInterface;

public class DefaultMovieService implements MovieServiceInterface{

   MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
