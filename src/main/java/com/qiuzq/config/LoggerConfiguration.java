package com.qiuzq.config;

import com.qiuzq.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * program: springBoot_day01
 * Date: 2018/12/22/022 10:53
 *
 * @author: Mr.Qiu
 * Description: 在Configuration中Autowired注解需要扫描特定的包
 */
@Configuration
@ComponentScan({"com.qiuzq.service"})
public class LoggerConfiguration extends WebMvcConfigurationSupport {

    private LoggerService loggerService;

    @Autowired
    public LoggerConfiguration(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggerInterceptor(loggerService)).addPathPatterns("/**");
    }
}
