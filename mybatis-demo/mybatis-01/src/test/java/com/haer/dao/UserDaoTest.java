package com.haer.dao;

import com.haer.pojo.User;
import com.haer.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        //getMapper
//        UserDao userDao = sqlSession.getMapper(UserDao.class);
//        List<User> userList = userDao.selectUserList();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//
//        //关闭sqlSession
//        sqlSession.close();
    }
}
