package com.zayzou.dvdstore.controller;

import com.zayzou.dvdstore.entity.Movie;
import com.zayzou.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired //no need to getter and setter
    private MovieServiceInterface movieService;

    @RequestMapping("/dvdstore-home")
    public @ModelAttribute("movies") List<Movie> displayHome() {
        List<Movie> movies = movieService.getMovieList();
        return movies;
    }
}
