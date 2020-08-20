package com.haer.dao;

import com.haer.pojo.User;
import com.haer.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //方式一：getMapper
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            HashMap<String, Integer> map = new HashMap<String, Integer>();

            map.put("startIndex", 1);
            map.put("pageSize", 2);

            List<User> userList = userMapper.selectUserList(map);

            //方式二：
            //List<User> userList = sqlSession.selectList("com.haer.dao.UserMapper.selectUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
            //关闭sqlSession(必须要关闭)
            sqlSession.close();
        }
    }

    @Test
    public void getUserByRowBounds() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {

            //RowBounds实现
            RowBounds rowBounds = new RowBounds(1, 2);

            //方式二：
            List<User> userList = sqlSession.selectList("com.haer.dao.UserMapper.selectUserByRowBounds", null, rowBounds);

            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
            //关闭sqlSession(必须要关闭)
            sqlSession.close();
        }
    }
}
