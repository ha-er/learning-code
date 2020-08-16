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
        SqlSession sqlSession = null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            //方式一：getMapper
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.selectUserList();

            //方式二：
            //List<User> userList = sqlSession.selectList("com.haer.dao.UserDao.selectUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
            //关闭sqlSession(必须要关闭)
            sqlSession.close();
        }

    }
}
