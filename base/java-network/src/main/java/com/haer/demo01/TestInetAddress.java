package com.haer.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //���ֲ�ѯ����IP��ַ����
        InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
        InetAddress inetAddress2 = InetAddress.getByName("localhost");
        InetAddress inetAddress3 = InetAddress.getLocalHost();
        System.out.println(inetAddress1);
        System.out.println(inetAddress2);
        System.out.println(inetAddress3);

        //��ѯ��վ��IP��ַ
        InetAddress inetAddress4 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress4);

        //���÷���
        System.out.println(inetAddress4.getAddress());
        System.out.println(inetAddress4.getCanonicalHostName());//�淶������
        System.out.println(inetAddress4.getHostAddress());//ip
        System.out.println(inetAddress4.getHostName());//�����򱾻���

    }
}
