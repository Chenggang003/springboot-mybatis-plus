package com.example.springbootmybatis.web.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootmybatis.web.po.DemoPlusPO;

/**
 * @author: chengang
 * @date: 2019/6/27
 * @description:
 */
public interface MyBatisPlusService extends IService<DemoPlusPO> {

    /**
     * 保存
     * @param demoPlusPO
     */
    void insert(DemoPlusPO demoPlusPO);

    /**
     * 分页查询
     * @param page
     * @param demoPlusPO
     * @return
     */
    IPage<DemoPlusPO> getByCondition(Page page,DemoPlusPO demoPlusPO);
}
