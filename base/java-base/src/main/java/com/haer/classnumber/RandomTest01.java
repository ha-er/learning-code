package com.haer.classnumber;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        //����һ��Random����
        Random r = new Random();
        //����0 ������ָ��ֵ
        int i = r.nextInt(101);//����0-100�������
        System.out.println(i);
    }
}
