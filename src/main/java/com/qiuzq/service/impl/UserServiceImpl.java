package com.qiuzq.service.impl;

import com.qiuzq.model.User;
import com.qiuzq.service.UserService;
import com.qiuzq.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: springBoot_day01
 * @Date: 2018/11/5/005 22:27
 * @Author: Mr.Qiu
 * @Description:
 */
@Service
@Transactional(rollbackFor = Exception.class)
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    @Autowired
    private com.qiuzq.mapper.UserMapper userMapper;

    @Override
    public void insert(User record) {
        this.userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(User user) {
        return this.userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    public List<User> list(User user, PageBean pageBean) {
        List<User> list = null;
        if (null != pageBean && pageBean.isPagination()) {
            list = this.userMapper.list(user);
        }
        return list;
    }
}
