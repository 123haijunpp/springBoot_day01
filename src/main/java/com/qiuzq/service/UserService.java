package com.qiuzq.service;

import com.qiuzq.model.User;
import com.qiuzq.util.PageBean;

import java.util.List;

/**
 * @program: springBoot_day01
 * @Date: 2018/11/5/005 22:26
 * @Author: Mr.Qiu
 * @Description:
 */
@SuppressWarnings("all")
public interface UserService {
    /**
     * 增加用户
     *
     * @param record
     */
    void insert(User record);

    /**
     * 查询单个
     *
     * @param id
     * @return
     */
    User selectByPrimaryKey(User id);

    /**
     * 查询所有
     *
     * @ param user
     * @ return
     */
    List<User> list(User user, PageBean pageBean);
}
