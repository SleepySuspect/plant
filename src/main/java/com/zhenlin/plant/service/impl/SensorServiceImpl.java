package com.zhenlin.plant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhenlin.plant.mapper.EngineSetMapper;
import com.zhenlin.plant.mapper.SensorMapper;
import com.zhenlin.plant.pojo.EngineSet;
import com.zhenlin.plant.pojo.Sensor;
import com.zhenlin.plant.service.SensorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SensorServiceImpl extends ServiceImpl<SensorMapper, Sensor> implements SensorService {

    @Override
    public List<Sensor> getAllSensor() {
        QueryWrapper<Sensor> queryWrapper=new QueryWrapper<Sensor>();
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public List<Sensor> getAllSensorById(Integer id) {
        QueryWrapper<Sensor> queryWrapper=new QueryWrapper<Sensor>();
        queryWrapper.eq("system_id", id);
        return baseMapper.selectList(queryWrapper);
    }
}
