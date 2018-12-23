package com.qiuzq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.qiuzq.mapper")
@ServletComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Sb01Application {
    public static void main(String[] args) {
        SpringApplication.run(Sb01Application.class, args);
    }
}
