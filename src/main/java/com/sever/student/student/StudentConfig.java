package com.sever.student.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student aysenur = new Student(
                    "Aysenur", "a@gmail.com", LocalDate.of(2016, MAY, 19)
            );
            Student abdullah = new Student(
                    "Abdullah", "ab@gmail.com", LocalDate.of(2020, MAY, 29)
            );
            studentRepository.saveAll(List.of(aysenur, abdullah));
        };
    }
}
