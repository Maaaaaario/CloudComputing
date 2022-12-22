package com.cloudcomputing.bussinesscomponent.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cloudcomputing.bussinesscomponent.PostBc;
import com.cloudcomputing.common.Theme;
import com.cloudcomputing.entity.PlayerEntity;
import com.cloudcomputing.entity.RecordEntity;
import com.cloudcomputing.mapper.PlayerMapper;
import com.cloudcomputing.mapper.RecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * @title: PostBcImpl
 * @Author Qihang Yin
 * @Date: 2022/11/26 15:54
 * @Version 1.0
 */
@Slf4j
@Service
public class PostBcImpl implements PostBc {

    @Autowired
    RecordMapper recordMapper;

    @Autowired
    PlayerMapper playerMapper;

    public String post(String id, Theme theme, String date, String time, String comment) {

        RecordEntity recordEntity = new RecordEntity();
        recordEntity.setId(Integer.valueOf(id));
        recordEntity.setTheme(theme.getCode());
        recordEntity.setDate(LocalDate.parse(date));
        recordEntity.setTime(LocalTime.parse(time));
        recordEntity.setComment(comment);

        try {
            recordMapper.insert(recordEntity);
        } catch (Exception e) {
            throw new RuntimeException("存在相同记录");
        }

        LambdaQueryWrapper<RecordEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(RecordEntity::getId, recordEntity.getId())
                .eq(RecordEntity::getTheme, recordEntity.getTheme())
                .eq(RecordEntity::getDate, recordEntity.getDate())
                .eq(RecordEntity::getTime, recordEntity.getTime())
                .eq(RecordEntity::getComment, recordEntity.getComment());

        try {
            recordEntity = recordMapper.selectOne(wrapper);
        } catch (Exception e) {
            throw new RuntimeException("数据库错误");
        }

        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setRecordId(recordEntity.getRecordId());

        try {
            playerMapper.insert(playerEntity);
        } catch (Exception e) {
            throw new RuntimeException("数据库错误");
        }

        return "拼本发布成功";

    }
}
