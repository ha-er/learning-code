package com.haer.demo05;

public class Person {
    {
        System.out.println("匿名代码块");
    }

    static {
        System.out.println("静态代码块");
    }


    public Person() {
        System.out.println("构造器");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("========");
        Person person1 = new Person();
    }
}
