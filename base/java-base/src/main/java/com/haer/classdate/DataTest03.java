package com.haer.classdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest03 {
    public static void main(String[] args) throws ParseException {

        String strTime = "2020��09��07�� 09:09:09:999";
        //��String����ת��Ϊ��������Date

        //�������ڸ�ʽ������
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss:SSS");
        Date date = simpleDateFormat.parse(strTime);
        System.out.println(date);
    }
}
