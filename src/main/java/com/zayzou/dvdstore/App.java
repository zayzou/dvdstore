package com.zayzou.dvdstore;

import com.zayzou.dvdstore.controller.MovieController;
import com.zayzou.dvdstore.repository.FileMovieRepository;
import com.zayzou.dvdstore.service.DefaultMovieService;

public class App 
{
    public static void main( String[] args )
    {
        FileMovieRepository movieRepository=new FileMovieRepository();
        MovieController movieController = new MovieController();
        DefaultMovieService movieService = new DefaultMovieService();

        movieService.setMovieRepository(movieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
