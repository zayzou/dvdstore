package com.zayzou.dvdstore.repository;

import com.zayzou.dvdstore.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void add(Movie movie) {
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);
            String info = movie.getTitle() + ";" + movie.getGenre();
            writer.write(info + "\n");
            writer.close();
            System.out.println(info + " Added successfully to file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
