package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.example")
@EnableJpaRepositories
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Main.class, args);
    }
}