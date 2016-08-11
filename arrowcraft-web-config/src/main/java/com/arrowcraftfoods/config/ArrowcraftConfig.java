package com.arrowcraftfoods.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.arrowcraftfoods")
public class ArrowcraftConfig extends WebMvcConfigurerAdapter {

    public static void main(String[] args){
        SpringApplication.run(ArrowcraftConfig.class, args);
    }
}
