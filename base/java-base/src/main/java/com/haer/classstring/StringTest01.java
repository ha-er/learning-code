package com.haer.classstring;

public class StringTest01 {
    public static void main(String[] args) {
        //创建一个"haer"字符串对象，该对象的内存地址，让变量s1保存
        //si只是一个引用，指向"haer"对象
        String s1 = "haer";
        //si并没有使用final修饰，所以可以让s1重新指向"sb"字符串
        //但是"haer","sb"字符串本身是不可以改变的
        s1 = "sb";
        System.out.println(s1);//sb

        String s2 = "哈儿";//第一次创建，会在常量池中新建一个"哈儿"字符串对象,该对象不可变
        String s3 = "哈儿";//第二次，就会直接从字符串常量池拿来用
        System.out.println(s2 == s3);//true。s2的指向是和s3一致的

        //使用String的构造方法创建俩个对象
        String s4 = new String("娇娇");
        String s5 = new String("娇娇");
        System.out.println(s4 == s5);//false
        //所以比较俩个字符串是否相等，必须使用String的equals方法
        System.out.println(s4.equals(s5));//true
        //本来Object类的equals方法是和==一样的，但是String重写了equals方法
        //所以是比较俩个字符串是否一样

        //一下程序执行结束后，会在字符串常量池创建三个字符串对象
        String s6 = "淼淼";
        String s7 = "憨批";
        String s8 = s6 + s7;
    }
}
