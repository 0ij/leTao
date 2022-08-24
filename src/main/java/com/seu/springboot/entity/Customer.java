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
@TableName("customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Cid", type = IdType.AUTO)
    private Integer cid;

    @TableField("Cname")
    private String cname;

    @TableField("Cpassword")
    private String cpassword;


}
