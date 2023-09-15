package com.zhenlin.plant.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhenlin.plant.pojo.EngineSet;
import com.zhenlin.plant.pojo.Sensor;

import java.util.List;

public interface SensorService extends IService<Sensor> {
    List<Sensor> getAllSensor();

    /**
     * 系统id
     * @param id
     * @return
     */
    List<Sensor> getAllSensorById(Integer id);
}
