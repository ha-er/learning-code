package com.haer.classdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest02 {
    public static void main(String[] args) {
        //��ȡ��ǰϵͳʱ��
        Date date = new Date();
        System.out.println(date);//Mon Sep 07 09:38:17 CST 2020
        //���ǿ��Կ���java.util.Date���Ѿ���д��Object��toString����
        //���Ƕ����й�����˵���ǻ��ǲ�����������

        //�����������롰��ʽ��������
        /*
        ���ڸ�ʽ��
        y ��
        M ��
        d ��
        H Сʱ
        m ��
        s ��
        S ����
         */
        //�������ڸ�ʽ������
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //��ʼ��ʽ��
        String formatTime = simpleDateFormat.format(date);
        System.out.println(formatTime);//2020-09-07 09:46:35:351
    }
}
