package com.zhenlin.plant.pojo;

import com.zhenlin.plant.service.EngineSetService;
import com.zhenlin.plant.service.SensorService;
import com.zhenlin.plant.service.SystimService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class Plant {
    @Autowired
    private EngineSetService engineSetService;

    @Autowired
    private SensorService sensorService;

    @Autowired
    private SystimService systemService;
    //  那就懒加载, 先新建出来一个对象， 保证spring的bean不为null
    private static Plant instance = new Plant();

    //plant对象有三个engineSet 每个engineSet(是一个对象)新开一个线程让他动态变化（每隔一段时间更新自己的属性）  更新engineSet对象的属性值  这个怎么做

    // 什么叫动态变化？  三个set动态， 还是什么。。 哦哦， 我给你写一个代码，你看看
    public List<EngineSet> engineSets;
    public String name;

    @PostConstruct
    // 当bean被加载到spring中后， 就回触发PostConstruct， 这时候初始化instance
    private void init() {
        System.out.println("init");
        List<EngineSet> dataEngineSet = engineSetService.getAllEngineSet();
        instance.name = "靖江电厂";
        ArrayList<EngineSet> engineSets = new ArrayList<>(dataEngineSet.size());



        for (int i = 0; i < dataEngineSet.size(); i++) {
            String name = dataEngineSet.get(i).getName();
            Integer id = dataEngineSet.get(i).getId();
            String description = dataEngineSet.get(i).getDescription();
            Integer deleted = dataEngineSet.get(i).getDeleted();
            List<Systim> dataSystim = systemService.getSystimById(id);
            ArrayList<Systim> systims = new ArrayList<>(dataSystim.size());
            for (int j = 0; j < dataSystim.size(); j++) {
                String systimName = dataSystim.get(j).getName();
                Integer systimId = dataSystim.get(j).getId();
                String systimDescription = dataSystim.get(j).getDescription();
                Integer systimDeleted = dataSystim.get(j).getDeleted();
                Integer systimEngineSetId = dataSystim.get(j).getEngineSetId();
                List<Sensor> dataSensor = sensorService.getAllSensorById(systimId);
                ArrayList<Sensor> sensors = new ArrayList<>(dataSensor.size());
                for (int k = 0; k < dataSensor.size(); k++) {
                    Integer sensorId = dataSensor.get(k).getId();
                    String sensorNode = dataSensor.get(k).getNode();
                    String sensorDescription = dataSensor.get(k).getDescription();
                    Integer sensorUpperBound = dataSensor.get(k).getUpperBound();
                    String sensorLowerBound = dataSensor.get(k).getLowerBound();
                    String unit = dataSensor.get(k).getUnit();
                    String importance = dataSensor.get(k).getImportance();
                    String determineNode = dataSensor.get(k).getDetermineNode();
                    Integer sensorSystemId = dataSensor.get(k).getSystemId();
                    Integer majorId = dataSensor.get(k).getMajorId();
                    sensors.add(new Sensor(sensorId, sensorNode, sensorDescription, sensorUpperBound,
                            sensorLowerBound, unit, importance, determineNode, sensorSystemId, majorId, ""));
                }
                systims.add(new Systim(systimId, systimName, systimDescription, systimEngineSetId, systimDeleted, sensors));
            }
            engineSets.add(new EngineSet(id, name, description, deleted, systims));
        }
        instance.engineSets = engineSets;
        System.out.println("初始化plant对象完成....");
    }

    private Plant() {
//        List<EngineSet> allEngineSet = engineSetService.getAllEngineSet();
//        List<Sensor> allSensor = sensorService.getAllSensor();
//        List<Institution> allInstitution = systemService.getAllInstitution();
//        this.name = "testname";
//        this.engineSets = allEngineSet;
//
//
//        // 初始化代码
//        System.out.println("初始化plant对象完成....");
    }

    // getInstance 是在把这个类添加在bean的路上， 这时候还不是bean
    public static Plant getInstance() {
        System.out.println("getInstance");

        return instance;
    }

}
