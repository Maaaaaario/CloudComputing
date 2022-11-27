package com.cloudcomputing.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author QihangYin
 * @since 2022-11-25
 */
@RestController
public class UserController {

    @PostMapping("/userEntity")
    public String hello(){
        return "这是一个剧本杀小程序";
    }

}

