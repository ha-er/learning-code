package com.haer.test;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1创建properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件(获取类的类加载器)
        ClassLoader classLoader = ReflectDemo03.class.getClassLoader();
        //getResourceAsStream获取资源字节流
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        //加载配置文件，转换为一个集合
        pro.load(resourceAsStream);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3加载该类进内存（forName()这是上面学到的一种获取class对象的方法）
        Class<?> cls = Class.forName(className);

        //4.创建对象（newInstance()这是上面学到的获取class对象后，创建对象的方法）
        Object obj = cls.newInstance();

        //5.获取方法对象（getMethod()这是上面学到的获取方法对象）
        Method method = cls.getMethod(methodName);

        //6.执行方法（invoke()这是上面学到的获取方法对象后执行方法的方法）
        method.invoke(obj);
    }
}
