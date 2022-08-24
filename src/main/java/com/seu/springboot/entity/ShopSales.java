package com.seu.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ShopSales")
public class ShopSales {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Sid", type = IdType.AUTO)
    private Integer Sid;

    @TableField("Sname")
    private String Sname;

    @TableField("Ssales")
    private Integer Ssales;
}
