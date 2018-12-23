package com.qiuzq.service;

import com.qiuzq.model.LoggerModel;
import com.qiuzq.model.LoggerModelWithBLOBs;

/**
 * program: springBoot_day01
 * Date: 2018/12/22/022 9:43
 *
 * @author: Mr.Qiu
 * Description:
 */
public interface LoggerService {
    int deleteByPrimaryKey(Integer id);

    int insert(LoggerModelWithBLOBs record);

    int insertSelective(LoggerModelWithBLOBs record);

    LoggerModelWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoggerModelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LoggerModelWithBLOBs record);

    int updateByPrimaryKey(LoggerModel record);
}
