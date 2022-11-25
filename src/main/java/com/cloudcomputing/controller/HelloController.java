package com.cloudcomputing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: HelloController
 * @Author Qihang Yin
 * @Date: 2022/11/23 16:04
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "这是一个剧本杀小程序";
    }
}
