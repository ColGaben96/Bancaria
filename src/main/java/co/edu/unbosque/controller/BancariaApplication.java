package co.edu.unbosque.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.unbosque.model"})
public class BancariaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BancariaApplication.class, args);
    }

}
