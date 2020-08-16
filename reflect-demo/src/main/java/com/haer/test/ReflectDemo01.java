package com.haer.test;

import com.haer.domain.Person;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName("全类名")
        Class cls1 = Class.forName("com.haer.domain.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);

        //比较
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);
        System.out.println(cls2 == cls3);

        Class cls4 = Class.forName("com.haer.domain.Student");
        System.out.println(cls4);

        System.out.println(cls1 == cls4);
    }
}
