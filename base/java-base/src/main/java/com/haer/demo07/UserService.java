package com.haer.demo07;

//接口使用interface定义
public interface UserService {
    //接口定义的变量都是常量，前面默认public static final修饰符
    double PI = 3.14;

    //接口前面默认有public abstract修饰符
    void run(String name);
}
