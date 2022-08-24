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
@TableName("request")
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Rid", type = IdType.AUTO)
    private Integer rid;

    @TableField("Rtype")
    private Integer rtype;

    @TableField("Gid")
    private Integer gid;

    @TableField("Kid")
    private Integer kid;

    @TableField("Aid")
    private Integer aid;

    @TableField("descibe")
    private String descibe;

    @TableField("result")
    private Integer result;


}
