package com.haer.classdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTest05 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        //��ȡϵͳ��ǰ����
        Calendar calendar = Calendar.getInstance();
        //�鿴�����һ�ܵĵڼ���
        //�����������һ�죬���Խ�������һ�����Ƿ���2
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);//2
        //�鿴����µĵڼ��죬7�����Է���7
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//7

        //��ȡָ��ʱ�������
        Calendar calendar2 = Calendar.getInstance();
        Date date = new SimpleDateFormat("yyyy.MM.dd").parse("2020.03.20");
        calendar2.setTime(date);
        //��ȡ�����ǵ��µڼ���
        System.out.println(calendar2.get(Calendar.DAY_OF_WEEK_IN_MONTH));//3
        //��ȡ�����Ǹ���ĵڶ�����
        System.out.println(calendar2.get(Calendar.DAY_OF_YEAR));//80
    }
}
