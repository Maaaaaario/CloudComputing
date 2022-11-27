package com.cloudcomputing.controller;

import com.cloudcomputing.bussinesscomponent.PostBc;
import com.cloudcomputing.common.Theme;
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

    @PostMapping("/post")
    public String post(String id, int theme, String date, String time, String comment) {
        return postBc.post(id, Theme.valueOf(theme), date, time, comment);
    }
}
