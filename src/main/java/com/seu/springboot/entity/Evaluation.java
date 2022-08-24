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
@TableName("evaluation")
public class Evaluation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Oid", type = IdType.AUTO)
    private Integer oid;

    @TableField("Cid")
    private Integer cid;

    @TableField("score")
    private Integer score;

    @TableField("comment")
    private String comment;


}
