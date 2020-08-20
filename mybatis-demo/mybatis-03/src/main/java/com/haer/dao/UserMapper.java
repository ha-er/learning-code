package com.haer.dao;

import com.haer.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询全部
    List<User> selectUserList();

}
