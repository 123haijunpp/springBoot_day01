package com.qiuzq.base.servlet;

import com.alibaba.druid.support.http.WebStatFilter;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid过滤器.
 *
 * @author Administrator
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
        }
)
@Slf4j
public class DruidStatFilter extends WebStatFilter {

    public DruidStatFilter() {
        log.info("******  执行DruidStatFilter...  ******");
    }
}
