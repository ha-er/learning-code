package com.haer.classdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTest05 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        //获取系统当前日历
        Calendar calendar = Calendar.getInstance();
        //查看今天的一周的第几天
        //国外周日算第一天，所以今天是周一，但是返回2
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);//2
        //查看这个月的第几天，7号所以返回7
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//7

        //获取指定时间的日历
        Calendar calendar2 = Calendar.getInstance();
        Date date = new SimpleDateFormat("yyyy.MM.dd").parse("2020.03.20");
        calendar2.setTime(date);
        //获取这周是当月第几周
        System.out.println(calendar2.get(Calendar.DAY_OF_WEEK_IN_MONTH));//3
        //获取这天是该年的第多少天
        System.out.println(calendar2.get(Calendar.DAY_OF_YEAR));//80
    }
}
