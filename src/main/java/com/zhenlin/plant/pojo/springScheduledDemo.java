package com.zhenlin.plant.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Component
public class springScheduledDemo {

    @Autowired
    private Plant plant;

    @Scheduled(cron = "1/5 * * * * ?")
    public void testScheduled(){
        System.out.println("**********");
        System.out.println(plant.name);
        System.out.println(plant.engineSets.size());
        Random random = new Random();
        int number = random.nextInt(101);
        String strNumber = String.valueOf(number);
        System.out.println(strNumber);
        plant.engineSets.get(0).getSystims().get(0).getSensors().get(0).setCurrentValue(strNumber);
        System.out.println("springScheduled run:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
