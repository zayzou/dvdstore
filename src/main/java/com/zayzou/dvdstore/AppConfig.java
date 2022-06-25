package com.zayzou.dvdstore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.zayzou.dvdstore.repository.file","com.zayzou.dvdstore.controller","com.zayzou.dvdstore.service"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
