package com.haer.demo01;

import org.junit.Test;

//客户
public class Client {
    @Test
    public void test1() {
        Host host = new Host();
        host.rent();
    }

    @Test
    public void test2() {
        //房东要出租房子
        Host host = new Host();
        //代理，中介帮房东租房，还会有些附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接找中介
        proxy.rent();
    }
}
