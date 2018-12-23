package com.qiuzq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * program: springBoot_day01
 * Date: 2018/12/23/023 10:39
 *
 * @author: Mr.Qiu
 * Description:
 */
@Configuration
@EnableWebMvc
@Slf4j
public class WebMvcConfig extends WebMvcConfigurationSupport {

    public WebMvcConfig() {
        log.info("**** 静态资源过滤中 ****");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("**** 静态资源过滤中 ****");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }
}
