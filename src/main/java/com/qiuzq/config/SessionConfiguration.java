package com.qiuzq.config;

import com.qiuzq.interceptor.SessionInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * program: springBoot_day01
 * Date: 2018/12/10/010 12:49
 *
 * @author: Mr.Qiu
 * Description: 将SessionInterceptor拦截器添加到SpringBoot的上下文中，并配置要拦截的路径
 */
@Slf4j
//@Configuration
public class SessionConfiguration extends WebMvcConfigurationSupport {

    public SessionConfiguration() {
        log.info("*****  执行SessionConfiguration...  ******");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        log.info("*****  执行SessionInterceptor...  ******");
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
    }
}


