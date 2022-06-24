package com.zayzou.dvdstore.service;

import com.zayzou.dvdstore.entity.Movie;
import com.zayzou.dvdstore.repository.GoLiveMovieRepository;
import com.zayzou.dvdstore.repository.MovieRepository;
import com.zayzou.dvdstore.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface{

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
