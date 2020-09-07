package com.haer.classnumber;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        //创建一个Random对象
        Random r = new Random();
        //包括0 不包括指定值
        int i = r.nextInt(101);//生成0-100的随机数
        System.out.println(i);
    }
}
