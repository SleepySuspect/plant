package com.zhenlin.plant.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhenlin.plant.mapper.SystemMapper;
import com.zhenlin.plant.pojo.Systim;
import com.zhenlin.plant.service.SystimService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SystimServiceImpl extends ServiceImpl<SystemMapper, Systim> implements SystimService {

    @Override
    public List<Systim> getAllSystim() {
        QueryWrapper<Systim> queryWrapper=new QueryWrapper<Systim>();
        return baseMapper.selectList(queryWrapper);
    }

    @Override
    public List<Systim> getSystimById(Integer id) {
        QueryWrapper<Systim> queryWrapper=new QueryWrapper<Systim>();
        queryWrapper.eq("engine_set_id", id);
        return baseMapper.selectList(queryWrapper);
    }
}
