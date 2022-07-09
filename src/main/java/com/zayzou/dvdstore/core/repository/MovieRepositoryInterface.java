package com.zayzou.dvdstore.core.repository;

import com.zayzou.dvdstore.core.entity.Movie;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MovieRepositoryInterface extends CrudRepository<Movie, Long> {


//    @Query("SELECT movie from Movie movie inner join fetch movie.mainActor  where movie.id = ?1")
    @Override
    @EntityGraph(value = "movie.actor-and-reviews", type = EntityGraph.EntityGraphType.FETCH)
    Optional<Movie> findById(Long id);

    /*  Movie add(Movie movie);
    List<Movie> list();

    Movie getById(Long id);*/
}
