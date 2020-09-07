package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        //collection�����ǽӿ�,ʹ��ArrayListʵ�֣���̬
        Collection c = new ArrayList();

        //1�����Ԫ��
        c.add(1);//�Զ�װ��int->Integer
        c.add(new Integer(100));

        Object o = new Object();
        c.add(o);//Collection����ֻ�ܵ����洢Ԫ�أ�����ֻ�ܴ��������ͣ�����洢���ڴ��ַ

        Customer haer = new Customer("haer", 20);
        c.add(haer);

        //2����ȡԪ�صĸ���
        System.out.println(c.size());//4
        //3���жϼ������Ƿ����Ԫ�أ�Ϊ�շ���true����Ϊ�շ���false
        System.out.println(c.isEmpty());//false

        //4��������ת��������
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
            //1
            //100
            //java.lang.Object@14ae5a5
            //Customer{name='haer', age=20}
        }

        //5�����
        c.clear();
        System.out.println(c.size());//0
        System.out.println(c.isEmpty());//true
    }

}

class Customer {
    String name;
    int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
