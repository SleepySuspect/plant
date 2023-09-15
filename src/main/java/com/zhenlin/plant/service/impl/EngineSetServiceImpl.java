package com.zhenlin.plant.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhenlin.plant.mapper.EngineSetMapper;
import com.zhenlin.plant.pojo.EngineSet;
import com.zhenlin.plant.service.EngineSetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EngineSetServiceImpl extends ServiceImpl<EngineSetMapper, EngineSet> implements EngineSetService {

    @Override
    public List<EngineSet> getAllEngineSet() {
        QueryWrapper<EngineSet> queryWrapper=new QueryWrapper<EngineSet>();
        return baseMapper.selectList(queryWrapper);
    }
}
