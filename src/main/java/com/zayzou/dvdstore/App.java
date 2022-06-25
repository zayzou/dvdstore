package com.zayzou.dvdstore;


import com.zayzou.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieController movieController = applicationContext.getBean(MovieController.class);
        movieController.addUsingConsole();
    }
}
