package com.zayzou.dvdstore.repository;

import com.zayzou.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository implements  MovieRepositoryInterface {

public void add(Movie movie){
    FileWriter writer;
    try{
        writer=new FileWriter("./movies.txt",true);
        writer.write(movie.getTitle()+";"+ movie.getGenre()+"\n");
        writer.close();
    }
    catch (IOException e){
        e.printStackTrace();
    }

}
}
