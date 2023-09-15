package com.zhenlin.plant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Plant {

    public static void main(String[] args) {
        SpringApplication.run(Plant.class, args);
    }

}
