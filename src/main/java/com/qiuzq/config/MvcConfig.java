package com.qiuzq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * program: springBoot_day01
 * Date: 2018/11/6/006 16:54
 * author: Mr.Qiu
 * Description:
 */
//@Configuration
//@EnableWebMvc
public class MvcConfig extends WebMvcConfigurationSupport {
    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver() {
        System.out.println("MvcConfig.freeMarkerViewResolver()");
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        resolver.setContentType("text/html; charset=UTF-8");
        resolver.setRequestContextAttribute("request");
        return resolver;
    }
}
