package com.cloudcomputing.bussinesscomponent.impl;

import com.cloudcomputing.bussinesscomponent.PostBc;
import com.cloudcomputing.common.Theme;
import com.cloudcomputing.entity.RecordEntity;
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

        return "拼本发布成功";

    }
}
