package com.haer.demo03;

import org.junit.Test;

//客户
public class Client {
    @Test
    public void test() {
        //真实角色
        Host host = new Host();

        //代理角色，现在没有
        ProxyInvacationHandler pih = new ProxyInvacationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);

        //这里的proxy就是自动生成了的，我们并没有写
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }

}
