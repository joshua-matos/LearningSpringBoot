package com.joshuamatos.LearningSpringBoot;

import com.joshuamatos.LearningSpringBoot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class LearningSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Student1",
						"student1@email.com",
						LocalDate.of(2000, Month.APRIL, 5),
						21
				),
				new Student(
						1L,
						"Student2",
						"student2@email.com",
						LocalDate.of(2001, Month.APRIL, 5),
						22
				)
		);
	}

}
