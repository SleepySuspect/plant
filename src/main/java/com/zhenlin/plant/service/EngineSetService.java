package com.zhenlin.plant.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhenlin.plant.pojo.EngineSet;

import java.util.ArrayList;
import java.util.List;

public interface EngineSetService extends IService<EngineSet> {
    List<EngineSet> getAllEngineSet();
}
