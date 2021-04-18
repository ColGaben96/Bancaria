package co.edu.unbosque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Class where Bancaria starts. Yes, according to Spring's documentation it is meant to run by a main, like in the old times.
 */

@SpringBootApplication
public class BancariaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BancariaApplication.class, args);
    }

}
