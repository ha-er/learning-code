package com.haer.collection;

import java.util.Properties;

public class MapTest02 {
    public static void main(String[] args) {
        //�������������
        //key��value���붼���ַ���
        Properties properties = new Properties();

        //���Ԫ��
        properties.setProperty("port", "8080");
        properties.setProperty("profiles", "dev");
        //key��ͬ���ᱻ����
        properties.setProperty("profiles", "prod");
        properties.setProperty("active", "prod");

        //ͨ��keyȡvalue
        System.out.println(properties.getProperty("port"));
        System.out.println(properties.getProperty("profiles"));
        System.out.println(properties.getProperty("active"));
        //8080
        //prod
        //prod
    }
}
