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
@TableName("system")
public class Systim {
    private Integer id;
    private String name;
    private String description;
    private Integer engineSetId;
    private Integer deleted;

    @TableField(exist = false)
    private List<Sensor> sensors;
}
