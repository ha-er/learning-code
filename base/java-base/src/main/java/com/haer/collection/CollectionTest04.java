package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        Integer i1 = new Integer(10);
        c.add(i1);
        Integer i2 = new Integer(10);
        c.remove(i2);//成功删除
        System.out.println(c.size());//0

        Student s1 = new Student("haer", 20);
        c.add(s1);
        Student s2 = new Student("haer", 20);
        c.remove(s2);//因为Student重写了equals方法，成功删除
        System.out.println(c.size());//0
    }
}

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (student.name.equals(this.name) && student.age == this.age) {
                return true;
            }
        }
        return false;
    }
}