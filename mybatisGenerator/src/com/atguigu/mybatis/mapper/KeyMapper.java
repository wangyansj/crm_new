package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.Key;
import java.util.List;

public interface KeyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Key record);

    Key selectByPrimaryKey(Integer id);

    List<Key> selectAll();

    int updateByPrimaryKey(Key record);
}