package com.example.springbootmybatis.web.service;

import com.example.springbootmybatis.web.po.DemoPO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: chengang
 * @date: 2019/6/28
 * @description:
 */
public interface DemoRepository extends MongoRepository<DemoPO,Long> {
}
