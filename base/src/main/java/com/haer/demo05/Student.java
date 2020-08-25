package com.haer.demo05;

public class Student {
    private static int age;//静态变量
    private String name;//非静态变量

    public void run() {

    }

    public static void go() {

    }

    public static void main(String[] args) {
        System.out.println(Student.age);
//        System.out.println(Student.name);//无法通过类名调用非静态变量
        Student.go();
//        Student.run();//非静态方法不能直接调用
        Student student = new Student();
        System.out.println(student.age);
        System.out.println(student.name);//非静态变量只能通过new对象后，调用
        student.go();
        student.run();//非静态方法，需要拿到对象后调用
    }
}
