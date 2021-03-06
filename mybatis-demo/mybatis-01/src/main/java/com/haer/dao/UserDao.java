package com.haer.dao;

import com.haer.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
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

    //map新增
    int insertMap(Map<String, Object> map);

    //模糊查询
    List<User> selectUserLikeName(String name);

    //批量删除
    int deleteUsers(int[] ids);
}
