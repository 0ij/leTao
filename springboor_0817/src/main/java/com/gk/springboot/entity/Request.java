package com.gk.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Request")
public class Request {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Rid", type = IdType.AUTO)
    private Integer Rid;

    @TableField("Kid")
    private Integer Kid;

    @TableField("Rtype")
    private Integer Rtype;

    @TableField("Gid")
    private Integer Gid;

    @TableField("description")
    private String description;

    @TableField("RCTime")
    private LocalDateTime RCTime;

    @TableField("RFTime")
    private LocalDateTime RFTime;

    @TableField("Aid")
    private Integer Aid;

    @TableField("result")
    private Integer result;
}
