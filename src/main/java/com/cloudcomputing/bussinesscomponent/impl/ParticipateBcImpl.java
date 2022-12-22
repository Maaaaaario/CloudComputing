package com.cloudcomputing.bussinesscomponent.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cloudcomputing.bussinesscomponent.ParticipateBc;
import com.cloudcomputing.entity.PlayerEntity;
import com.cloudcomputing.mapper.PlayerMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title: ParticipateBcImpl
 * @Author Qihang Yin
 * @Date: 2022/12/22 20:46
 * @Version 1.0
 */
@Slf4j
@Service
public class ParticipateBcImpl implements ParticipateBc {

    @Autowired
    PlayerMapper playerMapper;

    public String join(String userId, String gameId) {

        LambdaQueryWrapper<PlayerEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(PlayerEntity::getRecordId, Integer.valueOf(gameId));

        PlayerEntity playerEntity;

        try {
            playerEntity = playerMapper.selectOne(wrapper);
        } catch (Exception e) {
            throw new RuntimeException("数据库错误");
        }

        if (playerEntity != null) {
            if (playerEntity.getPlayer1() == null) {
                playerEntity.setPlayer1(Integer.valueOf(userId));
            } else if (playerEntity.getPlayer2() == null) {
                playerEntity.setPlayer2(Integer.valueOf(userId));
            } else if (playerEntity.getPlayer3() == null) {
                playerEntity.setPlayer3(Integer.valueOf(userId));
            } else if (playerEntity.getPlayer4() == null) {
                playerEntity.setPlayer4(Integer.valueOf(userId));
            } else if (playerEntity.getPlayer5() == null) {
                playerEntity.setPlayer5(Integer.valueOf(userId));
            } else if (playerEntity.getPlayer6() == null) {
                playerEntity.setPlayer6(Integer.valueOf(userId));
            } else if (playerEntity.getPlayer7() == null) {
                playerEntity.setPlayer7(Integer.valueOf(userId));
            } else if (playerEntity.getPlayer8() == null) {
                playerEntity.setPlayer8(Integer.valueOf(userId));
            } else {
                return "改场次人数已满";
            }
        }

        try {
            playerMapper.updateById(playerEntity);
        } catch (Exception e) {
            throw new RuntimeException("数据库错误");
        }

        return "参与成功";
    }
}
