package com.zayzou.dvdstore.core.repository;

import com.zayzou.dvdstore.core.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepositoryInterface extends CrudRepository<Movie, Long> {

  /*  Movie add(Movie movie);

    List<Movie> list();

    Movie getById(Long id);*/
}
