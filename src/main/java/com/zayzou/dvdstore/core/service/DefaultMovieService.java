package com.zayzou.dvdstore.core.service;

import com.zayzou.dvdstore.core.entity.Movie;
import com.zayzou.dvdstore.core.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired //no need to getter and setter
    private MovieRepositoryInterface movieRepository;


    @Transactional
    public Movie registerMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movie> getMovieList() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {

        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if (optionalMovie.isEmpty()){
            throw new NoSuchElementException();
        }
        Movie movie = optionalMovie.get();
        //init proxy
//        movie.getMainActor().getFirstName();
        movie.getReviews().forEach(review ->
                review.setMovie(null)
        );
        return Optional.of(movie);
    }
}
