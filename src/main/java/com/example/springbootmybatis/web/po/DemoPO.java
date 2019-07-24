package com.example.springbootmybatis.web.po;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: chengang
 * @date: 2019/6/18
 * @description:
 */
@Data
@Document(collection = "demo")
public class DemoPO {

    private Integer id;

    private String userName;

    private String msg;
}
