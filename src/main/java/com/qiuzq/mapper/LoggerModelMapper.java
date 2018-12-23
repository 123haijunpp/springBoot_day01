package com.qiuzq.mapper;

import com.qiuzq.model.LoggerModel;
import com.qiuzq.model.LoggerModelWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoggerModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoggerModelWithBLOBs record);

    int insertSelective(LoggerModelWithBLOBs record);

    LoggerModelWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoggerModelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LoggerModelWithBLOBs record);

    int updateByPrimaryKey(LoggerModel record);
}