package org.ruscoe.halloween;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Halloween Prop Generator Spring Boot application.
 */
@SpringBootApplication
public class HalloweenApplication {

    /**
     * Starts the Spring Boot application.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(HalloweenApplication.class, args);
    }
}
