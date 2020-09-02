package com.haer.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //三种查询本机IP地址方法
        InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
        InetAddress inetAddress2 = InetAddress.getByName("localhost");
        InetAddress inetAddress3 = InetAddress.getLocalHost();
        System.out.println(inetAddress1);
        System.out.println(inetAddress2);
        System.out.println(inetAddress3);

        //查询网站的IP地址
        InetAddress inetAddress4 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress4);

        //常用方法
        System.out.println(inetAddress4.getAddress());
        System.out.println(inetAddress4.getCanonicalHostName());//规范的名字
        System.out.println(inetAddress4.getHostAddress());//ip
        System.out.println(inetAddress4.getHostName());//域名或本机名

    }
}
