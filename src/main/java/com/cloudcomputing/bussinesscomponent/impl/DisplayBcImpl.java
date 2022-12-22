package com.cloudcomputing.bussinesscomponent.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cloudcomputing.bussinesscomponent.DisplayBc;
import com.cloudcomputing.common.Theme;
import com.cloudcomputing.entity.RecordEntity;
import com.cloudcomputing.mapper.RecordMapper;
import com.cloudcomputing.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @title: DisplayBcImpl
 * @Author Qihang Yin
 * @Date: 2022/12/22 17:38
 * @Version 1.0
 */
@Slf4j
@Service
public class DisplayBcImpl implements DisplayBc {

    @Autowired
    RecordMapper recordMapper;

    public Page<RecordEntity> get(Theme theme, String date, Integer current, Integer size) {

        LambdaQueryWrapper<RecordEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(RecordEntity::getTheme, theme.getCode());

        if (StringUtils.isNotEmpty(date)) {
            wrapper.eq(RecordEntity::getDate, LocalDate.parse(date));
        }

        Page<RecordEntity> page = new Page<>();
        page.setCurrent(current).setSize(size);

        try {
            page = recordMapper.selectPage(page, wrapper);
        } catch (Exception e) {
            throw new RuntimeException("数据库出错");
        }

        return page;
    }
}
