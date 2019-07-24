package com.example.springbootmybatis.web.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootmybatis.web.po.DemoPlusPO;
import com.example.springbootmybatis.web.service.MyBatisPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: chengang
 * @date: 2019/6/27
 * @description:
 */
@RestController
@RequestMapping("/mybatisPlus")
public class MyBatisPlusController {

    @Autowired
    private MyBatisPlusService myBatisPlusService;

    @RequestMapping("/insert")
    public void insert() {
        DemoPlusPO demoPlusPO = new DemoPlusPO();
        long currentTimeMillis = System.currentTimeMillis();
        demoPlusPO.setId(currentTimeMillis);
        demoPlusPO.setName(currentTimeMillis + "-name");
        demoPlusPO.setPassword(currentTimeMillis + "-password");
        myBatisPlusService.insert(demoPlusPO);
    }

    @RequestMapping("/page")
    public IPage<DemoPlusPO> getPage(@RequestParam(value = "pageNumber",defaultValue = "1") int pageNumber,
                                     @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                                     @RequestBody DemoPlusPO demoPlusPO) {
        Page mybatisPlusPage = new Page(pageNumber,pageSize);
        IPage<DemoPlusPO> iPage = myBatisPlusService.getByCondition(mybatisPlusPage,demoPlusPO);
        return iPage;
    }

    @RequestMapping("/update")
    public void update(@RequestParam String flag,@RequestParam Long id) {
        try {
            DemoPlusPO demoPlusPO = myBatisPlusService.getById(id);
            if ("1".equals(flag)) {
                Thread.sleep(15000);
            }
            demoPlusPO.setName(demoPlusPO.getName() + "-update" + flag);
            if (!myBatisPlusService.updateById(demoPlusPO)) {
                throw new Exception("更新失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
