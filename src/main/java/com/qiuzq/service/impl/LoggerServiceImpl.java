package com.qiuzq.service.impl;

import com.qiuzq.mapper.LoggerModelMapper;
import com.qiuzq.model.LoggerModel;
import com.qiuzq.model.LoggerModelWithBLOBs;
import com.qiuzq.service.LoggerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * program: springBoot_day01
 * Date: 2018/12/22/022 9:44
 *
 * @author: Mr.Qiu
 * Description:
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LoggerServiceImpl implements LoggerService {

    private LoggerModelMapper loggerModelMapper;

    @Autowired
    public void setLoggerModelMapper(LoggerModelMapper loggerModelMapper) {
        this.loggerModelMapper = loggerModelMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(LoggerModelWithBLOBs record) {
        return loggerModelMapper.insert(record);
    }

    @Override
    public int insertSelective(LoggerModelWithBLOBs record) {
        return 0;
    }

    @Override
    public LoggerModelWithBLOBs selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(LoggerModelWithBLOBs record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(LoggerModelWithBLOBs record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(LoggerModel record) {
        return 0;
    }
}
