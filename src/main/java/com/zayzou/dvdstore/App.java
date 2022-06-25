package com.zayzou.dvdstore;


import com.zayzou.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieController movieController = applicationContext.getBean(MovieController.class);
        movieController.addUsingConsole();
    }
}
