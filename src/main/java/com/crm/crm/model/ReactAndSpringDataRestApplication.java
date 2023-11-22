//This file allows us to run the server
package com.crm.crm.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactAndSpringDataRestApplication {
    // When we first run our server, we will call this main function => run the server
    public static void main(String[] args) {
        SpringApplication.run(ReactAndSpringDataRestApplication.class, args);
    }
}
