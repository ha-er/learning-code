package com.haer.demo01;

import com.haer.demo01.oop.Student;

public class OOPTest {
    public static void main(String[] args) {
        //类：抽象的，实例化
        //类实例化后会返回一个对象
        //student对象就是一个Student类的具体实例
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "小明";
        student1.age = 20;
        System.out.println(student1.name);
        System.out.println(student1.age);
    }
}
