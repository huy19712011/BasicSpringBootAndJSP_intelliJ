package com.example.basicspringbootandjsp_intellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

@SpringBootApplication
public class BasicSpringBootAndJspIntelliJApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicSpringBootAndJspIntelliJApplication.class, args);
        System.out.println("running...");
        System.out.println(System.getProperty("java.io.tmpdir"));
    }

}
