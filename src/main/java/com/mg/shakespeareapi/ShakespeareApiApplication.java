package com.mg.shakespeareapi;

import com.mg.shakespeareapi.repositories.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShakespeareApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShakespeareApiApplication.class, args);
    }
}
