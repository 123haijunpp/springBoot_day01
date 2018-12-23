package com.qiuzq.controller;

import com.alibaba.fastjson.JSONObject;
import com.qiuzq.util.LoggerUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * program: springBoot_day01
 * Date: 2018/12/22/022 10:20
 *
 * @author: Mr.Qiu
 * Description:
 */
@RestController
@RequestMapping(value = "/logger")
public class LoggerContrller {

    @GetMapping(value = {"/logger"})
    public JSONObject logger(HttpServletRequest request, String name, String age) throws Exception {
        JSONObject obj = new JSONObject();
        String msg = "msg";
        obj.put(msg, "用户：" + name + ",登录成功");
        obj.put(msg, "年龄：" + age + ",success");
        // 将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN, obj);
        return obj;
    }

}
