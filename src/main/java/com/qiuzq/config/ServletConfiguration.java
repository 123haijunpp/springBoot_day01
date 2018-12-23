package com.qiuzq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * program: springBoot_day01
 * Date: 2018/12/22/022 23:53
 *
 * @author: Mr.Qiu
 * Description: ServletComponentScan 注解开启自动装配Servlet的功能
 */
@Configuration
@Slf4j
public class ServletConfiguration {

    public ServletConfiguration() {
        log.info(" **** 执行 ServletConfiguration ****");
    }
}
