package com.seu.springboot.entity;

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
@TableName("shop")
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Sid")
    private Integer sid;

    @TableField("Sname")
    private String sname;

    @TableField("Sscore")
    private Integer sscore;

    @TableField("Savatar")
    private String savatar;

    @TableField("goodsnum")
    private Integer goodsnum;

    @TableField("locate")
    private String locate;

    @TableField("id")
    private Integer id;

}
