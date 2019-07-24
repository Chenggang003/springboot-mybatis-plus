package com.example.springbootmybatis.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootmybatis.web.po.DemoPlusPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: chengang
 * @date: 2019/6/27
 * @description:
 */
@Mapper
public interface MyBatisPlusMapper extends BaseMapper<DemoPlusPO> {

}
