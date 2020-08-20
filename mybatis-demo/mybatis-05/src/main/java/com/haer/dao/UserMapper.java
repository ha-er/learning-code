package com.haer.dao;

import com.haer.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    //查询全部
    @Select("select * from user")
    List<User> selectUserList();

    //根据id查询
    @Select("select * from user where id = #{id}")
    User selectUserById(@Param("id") int id);

    //新增
    @Insert("insert into mybatis.user (id, name, pwd) values (#{id}, #{name}, #{pwd})")
    int insertUser(User user);

    //修改
    @Update("update user set name = #{name}, pwd = #{pwd} where id = #{id}")
    int updateUser(User user);

    //删除
    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
