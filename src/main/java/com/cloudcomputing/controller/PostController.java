package com.cloudcomputing.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cloudcomputing.bussinesscomponent.DisplayBc;
import com.cloudcomputing.bussinesscomponent.ParticipateBc;
import com.cloudcomputing.bussinesscomponent.PostBc;
import com.cloudcomputing.common.Theme;
import com.cloudcomputing.entity.RecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: PostController
 * @Author Qihang Yin
 * @Date: 2022/11/23 16:04
 * @Version 1.0
 */
@RestController
public class PostController {

    @Autowired
    PostBc postBc;

    @Autowired
    DisplayBc displayBc;

    @Autowired
    ParticipateBc participateBc;

    @PostMapping("/post")
    public String post(String id, Integer theme, String date, String time, String comment) {
        return postBc.post(id, Theme.valueOf(theme), date, time, comment);
    }

    @GetMapping("/get")
    public Page<RecordEntity> get(Integer theme, String date, Integer current, Integer size) {

        return displayBc.get(Theme.valueOf(theme), date, current, size);
    }

    @PostMapping("/join")
    public String join(String id, String gameId) {
        return participateBc.join(id, gameId);
    }
}
