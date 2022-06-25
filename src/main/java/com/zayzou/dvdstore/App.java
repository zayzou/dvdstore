package com.zayzou.dvdstore;


import com.zayzou.dvdstore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


//@Configuration
//@ComponentScan(basePackages = {"com.zayzou.dvdstore.repository.file","com.zayzou.dvdstore.controller","com.zayzou.dvdstore.service"})
//@PropertySource("classpath:application.properties")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext applicationContext = SpringApplication.run(App.class,args);
        MovieController movieController = applicationContext.getBean(MovieController.class);
        movieController.addUsingConsole();
    }

}
