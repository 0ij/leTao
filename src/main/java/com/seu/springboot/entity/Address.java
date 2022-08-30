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
@TableName("Address")
public class Address {
    private static final long serialVersionUID = 1L;

    @TableId(value = "aid" , type = IdType.AUTO)
    private Integer aid;

    @TableField("cid")
    private String cid;

    @TableField("name")
    private String name;

    @TableField("address")
    private String address;

    @TableField("phone")
    private String phone;

}
