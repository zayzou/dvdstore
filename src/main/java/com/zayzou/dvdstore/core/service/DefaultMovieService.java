package com.zayzou.dvdstore.core.service;

import com.zayzou.dvdstore.core.entity.Movie;
import com.zayzou.dvdstore.core.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired //no need to getter and setter
    private MovieRepositoryInterface movieRepository;

    public Movie registerMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movie> getMovieList() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }
}
