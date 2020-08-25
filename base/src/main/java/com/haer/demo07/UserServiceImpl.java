package com.haer.demo07;

//类可以通过implements实现多个接口, 弥补了java不能多继承
public class UserServiceImpl implements UserService, UserService2 {
    public void run(String name) {
        //必须实现接口的方法
    }

    public void go(String name) {

    }
}
