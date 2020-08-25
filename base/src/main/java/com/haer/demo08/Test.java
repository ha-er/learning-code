package com.haer.demo08;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getOutId();
        //匿名内部类
        new Outer().out();
    }
}
