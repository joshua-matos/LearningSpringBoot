package com.joshuamatos.LearningSpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
          Student mark =  new Student(
                    "Mark",
                    "Mark@email.com",
                    LocalDate.of(2005, Month.JANUARY, 5)
            );
           Student al = new Student(
                    "Al",
                    "alb@email.com",
                    LocalDate.of(2003, Month.JANUARY, 15)
            );
           repository.saveAll(List.of(mark, al));
        };
    }
}
