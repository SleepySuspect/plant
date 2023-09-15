package com.zhenlin.plant.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("engine_set")
public class EngineSet {
    private Integer id;
    private String name;
    private String description;
    private Integer deleted;

    @TableField(exist = false)
    private List<Systim> systims;
}
