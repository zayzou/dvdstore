package com.zayzou.dvdstore.controller;

import com.zayzou.dvdstore.entity.Movie;
import com.zayzou.dvdstore.service.MovieService;
import com.zayzou.dvdstore.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    MovieServiceInterface movieService ;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole(){
     Scanner sc = new Scanner(System.in);

     System.out.println( "🎬 Movie title ?" );
     String title = sc.nextLine();

     System.out.println( "📽  Movie genre ?" );
     String genre = sc.nextLine();

     Movie movie = new Movie();
     movie.setGenre(genre);
     movie.setTitle(title);


     movieService.registerMovie(movie);
 }

}
