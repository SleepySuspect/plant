package com.zhenlin.plant.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhenlin.plant.pojo.Systim;

import java.util.List;

public interface SystimService extends IService<Systim> {
    List<Systim> getAllSystim();

    List<Systim> getSystimById(Integer id);
}
