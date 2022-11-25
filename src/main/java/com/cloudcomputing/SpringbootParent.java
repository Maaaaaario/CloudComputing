package com.cloudcomputing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @title: SpringbootParent
 * @Author Qihang Yin
 * @Date: 2022/11/23 16:03
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.cloudcomputing.mapper")
public class SpringbootParent {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootParent.class,args);
    }
}
