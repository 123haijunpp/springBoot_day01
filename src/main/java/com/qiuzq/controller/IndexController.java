package com.qiuzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * program: springBoot_day01
 * Date: 2018/12/10/010 12:32
 *
 * @author: Mr.Qiu
 * Description:
 */
@Controller
@RequestMapping("/user")
public class IndexController {

    /**
     * 初始化登录界面
     */
    @RequestMapping(value = "/login_view", method = RequestMethod.GET)
    public String loginView() {
        return "login";
    }

}
