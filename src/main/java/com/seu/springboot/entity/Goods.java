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
@TableName("Goods")
public class Goods {
    private static final long serialVersionUID = 1L;

    @TableId(value = "Gid" , type = IdType.AUTO)
    private Integer Gid;

    @TableField("Gname")
    private String Gname;

    @TableField("Gtype")
    private Integer Gtype;

    @TableField("Gpic")
    private String Gpic;

    @TableField("Gprice")
    private Integer Gprice;

    @TableField("inventory")
    private Integer inventory;

    @TableField("Sid")
    private Integer Sid;

    @TableField("OnSale")
    private Boolean OnSale;
}
