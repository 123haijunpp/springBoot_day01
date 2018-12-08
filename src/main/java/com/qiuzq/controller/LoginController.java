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
