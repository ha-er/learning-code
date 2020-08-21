package com.haer.dao;

import com.haer.service.UserService;
import com.haer.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        //用户实际调用业务层，dao层不接触
        UserService userService = new UserServiceImpl();

        //需要调用哪个业务层就传入什么接口实现
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());

        userService.getUser();
    }
}
