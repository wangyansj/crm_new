package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.entities.Lock;
import java.util.List;

public interface LockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lock record);

    Lock selectByPrimaryKey(Integer id);

    List<Lock> selectAll();

    int updateByPrimaryKey(Lock record);
}