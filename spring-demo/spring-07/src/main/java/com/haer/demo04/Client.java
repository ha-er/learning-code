package com.haer.demo04;

import com.haer.demo02.UserService;
import com.haer.demo02.UserServiceImpl;
import org.junit.Test;

public class Client {

    @Test
    public void test01() {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色现在不存在
        ProxyInvacationHandler pih = new ProxyInvacationHandler();

        //设置要代理的对象
        pih.setTarget(userService);

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
