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
@TableName("leTao_order")
public class Order {
    private static final long serialVersionUID = 1L;

    @TableId(value = "Oid", type = IdType.AUTO)
    private Integer Oid;

    @TableField("Gid")
    private String Gid;

    @TableField("Cid")
    private String Cid;

    @TableField("num")
    private Integer num;

    @TableField("totalprice")
    private Integer totalprice;

    @TableField("cnumber")
    private String cnumber;

    @TableField("state")
    private Integer state;

    @TableField("Aid")
    private Integer Aid;
}
