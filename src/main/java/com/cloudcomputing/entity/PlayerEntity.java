package com.cloudcomputing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Qihang Yin
 * @since 2022-11-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("player")
public class PlayerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "record_id", type = IdType.AUTO)
    private Integer recordId;

    private Integer player1;

    private Integer player2;

    private Integer player3;

    private Integer player4;

    private Integer player5;

    private Integer player6;

    private Integer player7;

    private Integer player8;

}
