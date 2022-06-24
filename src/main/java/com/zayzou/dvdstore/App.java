package com.zayzou.dvdstore;

import com.zayzou.dvdstore.controller.MovieController;

public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();
    }
}
