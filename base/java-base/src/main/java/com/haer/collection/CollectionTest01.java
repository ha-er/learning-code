package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        //collection本身是接口,使用ArrayList实现，多态
        Collection c = new ArrayList();

        //1、添加元素
        c.add(1);//自动装箱int->Integer
        c.add(new Integer(100));

        Object o = new Object();
        c.add(o);//Collection集合只能单个存储元素，并且只能存引用类型，这里存储的内存地址

        Customer haer = new Customer("haer", 20);
        c.add(haer);

        //2、获取元素的个数
        System.out.println(c.size());//4
        //3、判断集合中是否存在元素，为空返回true，不为空返回false
        System.out.println(c.isEmpty());//false

        //4、将集合转换成数组
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
            //1
            //100
            //java.lang.Object@14ae5a5
            //Customer{name='haer', age=20}
        }

        //5、清空
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
