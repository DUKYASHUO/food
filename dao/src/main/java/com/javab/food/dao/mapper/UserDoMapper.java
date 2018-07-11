package com.javab.food.dao.mapper;

import com.javab.food.dao.dataobject.UserDo;
import com.javab.food.dao.dataobject.UserDoExample;
import java.util.List;

public interface UserDoMapper {
    long countByExample(UserDoExample example);

    int deleteByExample(UserDoExample example);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    List<UserDo> selectByExample(UserDoExample example);
}