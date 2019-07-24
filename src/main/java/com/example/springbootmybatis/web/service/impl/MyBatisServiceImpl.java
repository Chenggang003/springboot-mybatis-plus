package com.example.springbootmybatis.web.service.impl;

import com.example.springbootmybatis.web.mapper.MyBatisMapper;
import com.example.springbootmybatis.web.po.DemoPO;
import com.example.springbootmybatis.web.service.MyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: chengang
 * @date: 2019/6/18
 * @description:
 */
@Service
public class MyBatisServiceImpl implements MyBatisService {

    @Autowired
    private MyBatisMapper myBatisMapper;

    @Override
    public void save(DemoPO demoPO) {
        myBatisMapper.save(demoPO);
    }
}
