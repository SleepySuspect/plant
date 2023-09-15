package com.zhenlin.plant.config;

import com.zhenlin.plant.pojo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Plant myPlantObject() {
        return Plant.getInstance();
    }
}
