package com.haer.service;

import com.haer.dao.UserDao;
import com.haer.dao.UserDaoImpl;
import com.haer.dao.UserDaoMysqlImpl;
import com.haer.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {

    //使用默认数据时，new UserDaoImpl
    //使用Mysql数据时，new UserDaoMysqlImpl
    //使用Oracle数据时，new UserDaoOracleImpl
    //发现用户需求变更时，我们需要改变业务层代码，这不是一个优秀的程序
    //private UserDao userDao =  new UserDaoOracleImpl();

    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
