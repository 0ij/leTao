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
@TableName("Administrator")
public class Administrator {
    private static final long serialVersionUID = 1L;
    @TableId(value = "Aid" , type = IdType.AUTO)
    private Integer Aid;

    @TableField("Apassword")
    private String Apassword;
}
