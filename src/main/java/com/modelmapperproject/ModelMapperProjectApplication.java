package com.modelmapperproject;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ModelMapperProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(ModelMapperProjectApplication.class, args);
    }

    //Add bean to component or add here
    //Inject modelmapper to use accordingly

    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
