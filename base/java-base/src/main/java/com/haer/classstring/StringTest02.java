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
        System.out.println(s3);//abcd,String�Ѿ���д��Object��toString����
        System.out.println(s3.toString());//�൱��
        //4�����±�Ϊ1��λ�ÿ�ʼ���������Ϊ2���ַ���
        String s4 = new String(bytes, 1, 2);
        System.out.println(s4);//bc
        //5
        char[] c1 = {'��', '��', '��', '��'};
        String s5 = new String(c1);
        System.out.println(s5);//���ǹ���
        //6  ���±�Ϊ2��λ�ÿ�ʼ���������Ϊ2���ַ���
        String s6 = new String(c1, 2, 2);
        System.out.println(s6);//����
    }
}
