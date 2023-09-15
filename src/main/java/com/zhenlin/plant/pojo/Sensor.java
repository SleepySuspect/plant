package com.zhenlin.plant.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("health_node")
public class Sensor {
    private Integer id;
    private String node;
    private String description;
    private Integer upperBound;
    private String lowerBound;
    private String unit;
    private String importance;
    private String determineNode;
    private Integer systemId;
    private Integer majorId;

    @TableField(exist = false)
    private String currentValue = "";
}
