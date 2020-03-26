package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    HDDAppProperties hddAppProperties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Global variable: ");
        System.out.println("\t email: " + hddAppProperties.getEmail());
        System.out.println("\t GA ID: " + hddAppProperties.getGoogleAnalyticsId());
        System.out.println("\t Authors: " + hddAppProperties.getAuthors());
        System.out.println("\t Example Map: " + hddAppProperties.getExampleMap());
    }
}
