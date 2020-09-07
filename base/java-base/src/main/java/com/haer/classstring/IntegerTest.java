package com.haer.classstring;

public class IntegerTest {
    public static void main(String[] args) {

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        //这里不会自动拆箱
        System.out.println(i1 == i2);//false
        //比较俩个引用类型的数据是否相等，不能使用==
        //Integer已经重写了equales方法
        System.out.println(i1.equals(i2));//true

        //如果数据在（-128~127）之间，java会在整型常量池中创建整型对象
        //数据不在这个区间的，会在堆中创建对象
        //不同于String，String是所有以""包裹的字符串都会在常量池中创建对象
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);//false

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//true
    }
}
