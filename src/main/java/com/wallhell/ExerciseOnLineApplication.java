package com.wallhell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExerciseOnLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseOnLineApplication.class, args);
    }

}
