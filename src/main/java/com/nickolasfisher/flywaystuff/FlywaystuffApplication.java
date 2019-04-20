package com.nickolasfisher.flywaystuff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FlywaystuffApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlywaystuffApplication.class, args);
    }

}
