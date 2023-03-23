package com.ista.LChumiExam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class LChumiExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(LChumiExamApplication.class, args);
	}

}
