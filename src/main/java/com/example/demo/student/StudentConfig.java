package com.example.demo.student;

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
            Student mariam = new Student(
                    "Mariam",
                    LocalDate.of(2000, Month.APRIL, 5),
                    "miriam.singh@yahoo.com"
            );
            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2002, Month.JANUARY, 10),
                    "alex.to@gmail.com"
            );

            repository.saveAll(
                List.of(mariam, alex)
            );
        };
    }
}
