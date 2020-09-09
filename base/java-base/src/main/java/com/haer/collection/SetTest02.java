package com.haer.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        //创建集合
        Set s = new HashSet();

        //因为在Employee重写了hashCode方法和equals方法，会判断e2元素在集合中存在
        Employee e1 = new Employee("1", "HaEr");
        //e2元素不会被添加
        Employee e2 = new Employee("1", "HaEr");
        //我们重写的hashCode方法是比较no属性的hashCode方法值（因为String类已经重写了hashCode方法）
        //hash值一样，然后会调用equals方法，发现名字不一样，所以e3元素会和e1元素在一条单向链表上
        //实现了把同一部门的员工放到一条单向链表，加快查询速度
        Employee e3 = new Employee("1", "淼淼");
        Employee e4 = new Employee("3", "娇娇");
        Employee e5 = new Employee("4", "磊磊");

        //重写了hashCode方法，所以是一样的
        System.out.println(e1.hashCode());//49
        System.out.println(e2.hashCode());//49

        //添加元素
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        s.add(e5);
        //集合个数
        System.out.println(s.size());//4

        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //Employee{no='4003', name='娇娇'}
            //Employee{no='5004', name='磊磊'}
            //Employee{no='1000', name='HaEr'}
            //Employee{no='1000', name='淼淼'}
        }
    }
}

//假设员工部门编号范围1-10
class Employee {
    //部门编号
    String no;
    //姓名
    String name;

    public Employee() {
    }

    public Employee(String no, String name) {
        this.no = no;
        this.name = name;
    }

    //重写hashCode方法
    @Override
    public int hashCode() {
        return this.no.hashCode();
    }

    //重写equals方法
    //使员工编号和名字相同时，当做同一对象
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            if (employee.no.equals(this.no) && employee.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}