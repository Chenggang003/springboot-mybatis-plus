package com.example.springbootmybatis.web.controller;

import com.example.springbootmybatis.web.po.DemoPO;
import com.example.springbootmybatis.web.service.MyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chengang
 * @date: 2019/6/18
 * @description:
 */
@RestController
@RequestMapping("/mybatis")
public class MyBatisController {

    @Autowired
    private MyBatisService myBatisService;

    @RequestMapping("/save")
    public DemoPO save() {
        DemoPO demoPO = new DemoPO();
        demoPO.setId(1);
        demoPO.setUserName("name");
        demoPO.setMsg("msg");
        return demoPO;
//        myBatisService.save(demoPO);
    }
}
