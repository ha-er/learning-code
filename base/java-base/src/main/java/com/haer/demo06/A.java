package com.haer.demo06;

public class A extends Action {
    @Override
    public void doSomething() {
        //A类继承了抽象类Action，那么必须重写Action的方法
        //除非A类也是抽象类，那么就由A的子类去重写方法
    }
}
