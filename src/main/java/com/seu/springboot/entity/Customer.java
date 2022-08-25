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
@TableName("leTao_customer")
public class Customer {
    private static final long serialVersionUID = 1L;

    @TableId(value = "Cid", type = IdType.AUTO)
    private Integer Cid;

    @TableField("Cname")
    private String cname;

    @TableField("Cpassword")
    private String cpassword;

}
