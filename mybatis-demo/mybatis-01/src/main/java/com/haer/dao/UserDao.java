package com.haer.dao;

import com.haer.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> selectUserList();
}
