package com.haer.demo06;

public abstract class Action {
    //抽象类不能被new出来
    //抽象方法必须在抽象类中
    public abstract void doSomething();

    public Action() {
        //c抽象类也是存在构造器
        //由子类实现
    }

    public void hello() {
        //抽象类可以写普通方法
    }
}
