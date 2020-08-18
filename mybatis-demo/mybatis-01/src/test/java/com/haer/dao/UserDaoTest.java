package com.haer.dao;

import com.haer.pojo.User;
import com.haer.utils.MybatisUtils;
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

    @Test
    public void selectUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = userDao.selectUserById(1);
            System.out.println(user);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = new User(4, "思思", "040404");
            userDao.insertUser(user);
            //开启事务,否则新增、修改、删除不会生效
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = new User(4, "思思", "000320");
            userDao.updateUser(user);
            //开启事务
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            userDao.deleteUser(4);
            //开启事务
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void insertMap() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("userId", 520);
            map.put("favorite", "思思");
            userDao.insertMap(map);
            //开启事务,否则新增、修改、删除不会生效
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectUserLikeName() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> user = userDao.selectUserLikeName("哈");
//            List<User> user = userDao.selectUserLikeName("%哈%");
            System.out.println(user);
            //开启事务,否则新增、修改、删除不会生效
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void deleteUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            int[] ids = new int[2];
            ids[0] = 31;
            ids[1] = 32;
            userDao.deleteUsers(ids);
            //开启事务
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }
}
