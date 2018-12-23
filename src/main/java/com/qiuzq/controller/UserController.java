package com.qiuzq.controller;

import com.alibaba.fastjson.JSONObject;
import com.qiuzq.entity.TUserEntity;
import com.qiuzq.jpa.UserJPA;
import com.qiuzq.util.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * program: springBoot_day01
 * Date: 2018/12/23/023 12:09
 *
 * @author: Mr.Qiu
 * Description:
 */
@RestController
public class UserController {

    private UserJPA userJPA;

    @Autowired
    public UserController(UserJPA userJPA) {
        this.userJPA = userJPA;
    }

    @GetMapping(value = "/nativeQueryAllUser")
    public List<TUserEntity> nativeQueryAllUser(HttpServletRequest request, Long id) {
        request.setAttribute(LoggerUtils.LOGGER_RETURN, id);
        return userJPA.nativeQueryAllUser(id);
    }

    @GetMapping(value = "/modifyDel", produces = {"text/plain;charset=utf-8"})
    public JSONObject modifyDel(TUserEntity user, HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        userJPA.deleteQuery(user.getUsername(), user.getPassword());
        obj.put("msg", "删除成功！");
        obj.put("code", "1");
        obj.put("data", "username:" + user.getUsername() + ",password:" + user.getPassword());
        request.setAttribute(LoggerUtils.LOGGER_RETURN, obj);
        return obj;
    }

    @GetMapping(value = "/getAll")
    public List<TUserEntity> list(HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        List<TUserEntity> userJPAAll = userJPA.findAll();
        jsonObject.put("msg", "查询: TUserEntity" + userJPAAll);
        // 将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN, jsonObject);
        return userJPAAll;
    }

    @GetMapping(value = "/save", produces = {"text/plain;charset=utf-8"})
    public String save(TUserEntity user) {
        TUserEntity save = userJPA.save(user);
        if (save != null) {
            return "增加成功！";
        }
        return "增加失败！";
    }

    @GetMapping("/del")
    public Map<String, Object>
    delete(TUserEntity user, HttpServletRequest request) {
        Map<String, Object> jsonData = new ConcurrentHashMap<>(16);
        userJPA.delete(user);
        jsonData.put("msg", "删除成功");
        jsonData.put("code", -1);
        jsonData.put("data", user);
        request.setAttribute(LoggerUtils.LOGGER_RETURN, jsonData);
        return jsonData;
    }

}
