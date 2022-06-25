package com.zayzou.dvdstore.service;

import com.zayzou.dvdstore.entity.Movie;
import com.zayzou.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired //no need to getter and setter
    private MovieRepositoryInterface movieRepository;

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
