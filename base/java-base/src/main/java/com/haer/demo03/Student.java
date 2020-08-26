package com.haer.demo03;

public class Student extends Person {
    //重写父类方法
    @Override
    public void run() {
        System.out.println("student");
    }

    public void eat() {
        System.out.println("eat");
    }
}
