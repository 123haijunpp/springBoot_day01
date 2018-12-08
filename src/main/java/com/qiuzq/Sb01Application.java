package com.qiuzq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.qiuzq.mapper")
@ComponentScan({"com.qiuzq.controller", "com.qiuzq.service", "com.qiuzq.aop", "com.qiuzq.config"})
@ServletComponentScan
@EnableAutoConfiguration
public class Sb01Application {
    public static void main(String[] args) {
        SpringApplication.run(Sb01Application.class, args);
    }
}
