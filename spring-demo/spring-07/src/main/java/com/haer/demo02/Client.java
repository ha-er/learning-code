package com.haer.demo02;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
