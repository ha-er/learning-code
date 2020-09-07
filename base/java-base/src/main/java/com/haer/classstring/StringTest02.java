package com.haer.classstring;

public class StringTest02 {
    public static void main(String[] args) {
        //1
        String s1 = "haer";
        //2
        String s2 = new String("haer");
        //3
        byte[] bytes = {97, 98, 99, 100};
        String s3 = new String(bytes);
        System.out.println(s3);//abcd,String已经重写了Object的toString方法
        System.out.println(s3.toString());//相当于
        //4：从下标为1的位置开始，输出长度为2的字符串
        String s4 = new String(bytes, 1, 2);
        System.out.println(s4);//bc
        //5
        char[] c1 = {'我', '是', '哈', '儿'};
        String s5 = new String(c1);
        System.out.println(s5);//我是哈儿
        //6  从下标为2的位置开始，输出长度为2的字符串
        String s6 = new String(c1, 2, 2);
        System.out.println(s6);//哈儿
    }
}
