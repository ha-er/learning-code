package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        Integer i1 = new Integer(10);
        c.add(i1);
        System.out.println(c.contains(i1));//true

        Integer i2 = new Integer(10);
        //i2并没有在集合c中
        //contains()方法底层调用的是equals方法，因为Integer重写了equals方法，所以是比较内容
        System.out.println(c.contains(i2));//true

        Person person1 = new Person("haer", 20);
        c.add(person1);
        System.out.println(c.contains(person1));//true

        Person person2 = new Person("haer", 20);
        //person2并没有add到集合c中
        System.out.println(c.contains(person2));//false(重写equals方法前返回false)
        //因为此时没有重写Person的equals方法，所以比较的是内存地址
        System.out.println(c.contains(person2));//true(重写equals方法后返回true)
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (person.name.equals(this.name) && person.age == this.age) {
                return true;
            }
        }
        return false;
    }
}