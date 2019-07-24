package com.example.springbootmybatis.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootmybatis.web.mapper.MyBatisPlusMapper;
import com.example.springbootmybatis.web.po.DemoPlusPO;
import com.example.springbootmybatis.web.service.MyBatisPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: chengang
 * @date: 2019/6/27
 * @description:
 */
@Service
public class MyBatisPlusServiceImpl extends ServiceImpl<MyBatisPlusMapper,DemoPlusPO> implements MyBatisPlusService {

    @Autowired
    private MyBatisPlusMapper myBatisPlusMapper;

    @Override
    public void insert(DemoPlusPO demoPlusPO) {
        myBatisPlusMapper.insert(demoPlusPO);
    }

    @Override
    public IPage<DemoPlusPO> getByCondition(Page page, DemoPlusPO demoPlusPO) {
        QueryWrapper<DemoPlusPO> queryWrapper = new QueryWrapper<DemoPlusPO>();
        queryWrapper.like(demoPlusPO.getName() != null,"name", demoPlusPO.getName());
        return baseMapper.selectPage(page,queryWrapper);
    }
}
