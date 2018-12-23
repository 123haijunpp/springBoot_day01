package com.qiuzq.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import sun.net.www.content.image.png;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * program: springBoot_day01
 * Date: 2018/12/10/010 12:36
 *
 * @author: Mr.Qiu
 * Description: 拦截器实体类，如果没有session状态则跳转登录页面
 */
@Slf4j
public class SessionInterceptor implements HandlerInterceptor {

    public SessionInterceptor() {
        System.out.println("拦截器开始了...");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contextPath = request.getServletContext().getContextPath();
        String loginView = contextPath + "/user/login_view";
        String login = contextPath + "/user/login";

        // 静态资源不拦截
        String requestURI = request.getRequestURI();
        String suffix = requestURI.substring(requestURI.lastIndexOf("."));
        log.info(" 拦截 " + requestURI);
        String[] staticSources = {".js", ".css", ".jpg", ".png"};
        for (String s : staticSources) {
            if (s.equals(suffix)) {
                return true;
            }
        }
        // 登录不做拦截
        if (loginView.equals(request.getRequestURI()) || login.equals(request.getRequestURI())) {
            return true;
        }
        // 验证session是否存在
        String sessionUser = "_session_user";
        if (null == request.getSession().getAttribute(sessionUser)) {
            response.sendRedirect(loginView);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String path = "/springBoot/js/jquery-3.3.1.min.js";
        System.out.println(path.substring(path.lastIndexOf(".")));
    }
}
