package com.educandoweb.course;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CourseApplication {

    public static void main(String[] args) {
        log.info("Iniciando Api de Workshop");
        SpringApplication.run(CourseApplication.class, args);
        log.info("Api de Workshop iniciada com sucesso");
    }
}
