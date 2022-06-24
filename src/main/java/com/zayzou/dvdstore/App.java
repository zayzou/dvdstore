package com.zayzou.dvdstore;

import com.zayzou.dvdstore.controller.MovieController;
import com.zayzou.dvdstore.repository.GoLiveMovieRepository;
import com.zayzou.dvdstore.service.MovieService;

public class App 
{
    public static void main( String[] args )
    {
        GoLiveMovieRepository movieRepository=new GoLiveMovieRepository();
        MovieController movieController = new MovieController();
        MovieService movieService = new MovieService();

        movieService.setMovieRepository(movieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
