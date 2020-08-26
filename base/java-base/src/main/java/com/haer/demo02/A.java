package com.haer.demo02;

public class A extends B {

    @Override//注解：重写
    public void test() {
//        super.test();
        System.out.println("A=>test");
    }
}
