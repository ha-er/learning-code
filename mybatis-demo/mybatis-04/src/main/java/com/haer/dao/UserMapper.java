package com.haer.dao;

import com.haer.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部
    List<User> selectUserList(Map<String, Integer> map);

    List<User> selectUserByRowBounds();
}
