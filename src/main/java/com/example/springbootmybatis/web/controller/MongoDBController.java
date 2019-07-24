package com.example.springbootmybatis.web.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootmybatis.web.po.DemoPO;
import com.example.springbootmybatis.web.po.DemoPlusPO;
import com.example.springbootmybatis.web.service.DemoRepository;
import com.example.springbootmybatis.web.service.MyBatisPlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chengang
 * @date: 2019/6/27
 * @description:
 */
@RestController
@RequestMapping("/mongo")
public class MongoDBController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private DemoRepository demoRepository;

    @RequestMapping("/insert")
    public void insert() {
        DemoPO demoPO = new DemoPO();
        demoPO.setId(1);
        demoPO.setUserName("我是mongo");
        demoPO.setMsg("我是message");
//        mongoTemplate.save(demoPO);
//        demoRepository.insert(demoPO);
    }
}
