package com.haer.dao;

import com.haer.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部
    List<User> selectUserList();

    //根据id查询
    User selectUserById(int id);

    //新增
    int insertUser(User user);

    //修改
    int updateUser(User user);

    //删除
    int deleteUser(int id);
}
