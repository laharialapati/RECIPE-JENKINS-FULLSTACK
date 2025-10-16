package com.klef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RecipeManagementApplicationTests extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RecipeManagementApplicationTests.class, args);
        System.out.println("🚀 Recipe Management Project is Running ...");
    }
}
