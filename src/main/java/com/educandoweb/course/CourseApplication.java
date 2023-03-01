package com.educandoweb.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CourseApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Iniciando Api de Workshop");
		SpringApplication.run(CourseApplication.class, args);
		LOGGER.info("Api de Workshop iniciada com sucesso");
	}
}
