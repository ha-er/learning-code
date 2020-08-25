package com.haer.demo08;

public class Outer {
    private String OutName = "外部名字";
    private static int id = 1;

    public void out() {
        System.out.println("这是外部类的方法");
        //局部内部类
        class partInner {

        }
    }

    private void priOut() {
        System.out.println("这是外部类的私有方法");
    }

    private static void priStaticOut() {
        System.out.println("这是外部类的私有静态方法");
    }

    //内部类
    public class Inner {
        private String inName = "内部名字";

        public void in() {
            System.out.println("这是内部类的方法");
        }

        //获得外部类的私有属性
        public void getOutId() {
            System.out.println(OutName);
            priOut();//调用外部内的私有方法
        }

    }

    //静态内部类,只能调用外部类静态的变量和方法
    public static class staticInner {
        public void getOutId() {
            System.out.println(id);
            priStaticOut();
        }

    }

}

//一个Class文件可以有多个class类，但只有有一个类被声明为public
class A {

}
