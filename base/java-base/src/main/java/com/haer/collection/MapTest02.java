package com.haer.collection;

import java.util.Properties;

public class MapTest02 {
    public static void main(String[] args) {
        //创建属性类对象
        //key和value必须都是字符串
        Properties properties = new Properties();

        //添加元素
        properties.setProperty("port", "8080");
        properties.setProperty("profiles", "dev");
        //key相同，会被覆盖
        properties.setProperty("profiles", "prod");
        properties.setProperty("active", "prod");

        //通过key取value
        System.out.println(properties.getProperty("port"));
        System.out.println(properties.getProperty("profiles"));
        System.out.println(properties.getProperty("active"));
        //8080
        //prod
        //prod
    }
}
