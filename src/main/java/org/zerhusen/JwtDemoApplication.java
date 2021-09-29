package org.zerhusen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtDemoApplication.class, args);
        System.out.println("\nMock Primary IAM started. ");
       System.out.println("This is a Java backend app that performance user authentication and mocks the customer's primary IAM. ");
         System.out.println("It authenticates the username against a local db and returns an access token.");
    }
}
