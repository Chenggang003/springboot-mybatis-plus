package com.example.springbootmybatis.web.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author: chengang
 * @date: 2019/6/27
 * @description:
 */
@Data
@TableName("t_demo_plus")
public class DemoPlusPO {

    private Long id;

    private String name;

    private String password;

    @Version
    private Integer version;
}
