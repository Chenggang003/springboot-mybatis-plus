package com.example.springbootmybatis.web.mapper;

import com.example.springbootmybatis.web.po.DemoPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: chengang
 * @date: 2019/6/18
 * @description:
 */
@Mapper
public interface MyBatisMapper {

    /**
     * 保存信息
     * @param demoPO
     */
    void save(DemoPO demoPO);
}
