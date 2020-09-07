package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        //�������϶���
        Collection c = new ArrayList();

        Integer i1 = new Integer(10);
        c.add(i1);
        System.out.println(c.contains(i1));//true

        Integer i2 = new Integer(10);
        //i2��û���ڼ���c��
        //contains()�����ײ���õ���equals��������ΪInteger��д��equals�����������ǱȽ�����
        System.out.println(c.contains(i2));//true

        Person person1 = new Person("haer", 20);
        c.add(person1);
        System.out.println(c.contains(person1));//true

        Person person2 = new Person("haer", 20);
        //person2��û��add������c��
        System.out.println(c.contains(person2));//false(��дequals����ǰ����false)
        //��Ϊ��ʱû����дPerson��equals���������ԱȽϵ����ڴ��ַ
        System.out.println(c.contains(person2));//true(��дequals�����󷵻�true)
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

    //��дequals����
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