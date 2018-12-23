package com.qiuzq.controller;

import com.qiuzq.model.User;
import com.qiuzq.service.UserService;
import com.qiuzq.util.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * program: springBoot_day01
 * Date: 2018/11/6/006 15:21
 *
 * @author: Mr.Qiu
 * Description:
 */
@Controller
@RequestMapping("/user")
@SuppressWarnings("all")
@Slf4j
public class LoginController {

//    private final org.slf4j.Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String doIndex() {
        return "index";
    }

    @RequestMapping("/doFastJson")
    @ResponseBody
    public List<User> doFastJson(User user, PageBean pageBean, HttpServletRequest request) {
        pageBean = new PageBean();
        pageBean.setRequest(request);
        return userService.list(user, pageBean);
    }

    @RequestMapping(value = {"/login"}, produces = {"text/plain;chaset=UTF-8"})
    @ResponseBody
    public String doFastJson(User user, HttpSession session) {
        // 登录成功
        boolean flag = true;
        String result = "登录失败！";

        // 用户不存在
        if (null == user.getUsername()) {
            flag = false;
            result = "用户不存在，登录失败！";
        } else if (!"123".equals(user.getPassword())) {
            flag = false;
            result = "密码错误，登录失败！";
        }

        if ("admin".equals(user.getUsername()) && "123".equals(user.getPassword()) && flag) {
            // 将用户写入session
            session.setAttribute("_session_user", user);
            result = "登录成功！";
        }
        return result;
    }

    @RequestMapping("/doFastJsonNullList")
    @ResponseBody
    public List<User> doFastJsonNullList(User user, PageBean pageBean, HttpServletRequest request) {
        List list = new ArrayList();
        System.out.println(list);
        return list;
    }

    @ResponseBody
    @RequestMapping({"/userList"})
    public Map<String, Object> list(ModelMap modelMap, User user, PageBean pageBean, HttpServletRequest request) {
        modelMap.addAttribute("name", "FreeMarker 模版引擎");
        pageBean = new PageBean();
        pageBean.setRequest(request);
        List<User> users = userService.list(user, pageBean);
        Map<String, Object> data = new HashMap<>(16);
        data.put("code", "0");
        data.put("msg", "ok");
        data.put("count", pageBean.getTotal());
        data.put("data", users);
        return data;
    }

}
