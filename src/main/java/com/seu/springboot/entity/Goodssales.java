package com.seu.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("goodssales")
public class Goodssales implements Serializable {

    private static final long serialVersionUID = 1L;

    //商品id
    @TableId(value = "Gid", type = IdType.AUTO)
    private Integer gid;

    @TableField("goodsales")
    private Integer goodsales;

}
