package com.example.sample_spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringBootAppApplication.class, args);
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
