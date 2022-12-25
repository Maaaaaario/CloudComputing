package com.cloudcomputing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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

    @TableId(value = "record_id")
    private Integer recordId;

    @TableField(value = "player_1")
    private Integer player1;

    @TableField(value = "player_2")
    private Integer player2;

    @TableField(value = "player_3")
    private Integer player3;

    @TableField(value = "player_4")
    private Integer player4;

    @TableField(value = "player_5")
    private Integer player5;

    @TableField(value = "player_6")
    private Integer player6;

    @TableField(value = "player_7")
    private Integer player7;

    @TableField(value = "player_8")
    private Integer player8;

}
