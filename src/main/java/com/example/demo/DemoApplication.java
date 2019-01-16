package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 *   启动类:
 *      1:定义当前为配置类
 *      2:启动自动配置
 *      3:组件扫描
 */
@SpringBootApplication
@MapperScan("com.example.demo.**.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

