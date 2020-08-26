package com.haer.demo04;

public class Test {
    public static void main(String[] args) {

        //x instanceof y：x与y必须存在父子关系，否则编译报错

        Object object = new Student();
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);
        System.out.println("==================");
        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher);
//        System.out.println(person instanceof String);//编译报错
        System.out.println("==================");
        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
//        System.out.println(student instanceof Teacher);//编译报错
//        System.out.println(student instanceof String);//编译报错
    }
}
