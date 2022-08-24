package com.seu.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Oid", type = IdType.AUTO)
    private Integer oid;

    @TableField("Gid")
    private Integer gid;

    @TableField("Cid")
    private Integer cid;

    @TableField("num")
    private Integer num;

    @TableField("totalprice")
    private Float totalprice;

    @TableField("address")
    private String address;

    @TableField("state")
    private Integer state;

    @TableField("courier_number")
    private String courierNumber;


}
