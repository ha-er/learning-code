package com.haer.demo03;

public class Test {
    public static void main(String[] args) {

        //一个对象的实际类型都是确定的
        //new Student()
        //new Person()

        //可以指向的引用类型就不确定了：父类的引用指向子类
        Student student = new Student();
        //左边类代表，该对象能够调用的方法是在左边类中有的
        //右边是子类，若是俩个类都有的方法，如果子类重写了方法，就用子类的，否则调用父类的
        Person person = new Student();

        student.run();
        person.run();//因为Student重写了Person的run方法，所以都会调用Student的run方法

        student.eat();//子类可以调用独有的方法
        ((Student) person).eat();//父类不能直接调用子类独有方法,只能强制转换为Student类型调用
    }
}
