package com.haer.demo01.oop;

//学生类
public class Student {
    //属性：字段
    public String name;
    public int age;

    //一个类什么都不写，默认带一个无参构造器
    //现在显示定义无参构造
    //new 的时候，就会调用构造器方法，一般用来初始化值
    public Student() {
        System.out.println("无参构造");
    }

    //有参构造
    //一旦定义了有参构造，无参构造就必须显示定义
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void study() {
        System.out.println(this.name);
    }

}
