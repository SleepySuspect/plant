package com.zhenlin.plant.controller;


import com.zhenlin.plant.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    @Autowired
    private Plant plant;

    @GetMapping("/api/hello")
    public String test(){
        System.out.println(plant.name);
        return plant.engineSets.get(0).getSystims().get(0).getSensors().get(0).getCurrentValue();
    }
    @GetMapping("/api/hello2")
    public String test2(){
        System.out.println(plant.name);
        return "allSensor.toString()";
    }

    @GetMapping("/trees")
    public String getPlantTree(){
        return "Result.ok(iPage)";
    }


}
