package com.haer.classdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest04 {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //��ȡ�Ի�ȡ��1970��1��1��00ʱ00��00��000�����ȥ1000�����ʱ��
        //��Ϊ���ڱ��������������Լ���8Сʱ
        Date date = new Date(1000);
        System.out.println(simpleDateFormat.format(date));//1970-01-01 08:00:01

        //��ȡ��ǰϵͳǰ10���ӵ�ʱ��
        //��ȡ�Ի�ȡ��1970��1��1��00ʱ00��00��000���뵽��ǰ���ܺ��� - 10���ӵĺ�����
        Date date1 = new Date(System.currentTimeMillis() - (1000 * 60 * 10));
        System.out.println(simpleDateFormat.format(date1));
    }
}
