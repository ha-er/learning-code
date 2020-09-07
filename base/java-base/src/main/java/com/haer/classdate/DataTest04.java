package com.haer.classdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest04 {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取自获取自1970年1月1日00时00分00秒000毫秒过去1000毫秒的时间
        //因为处于北京东八区，所以加了8小时
        Date date = new Date(1000);
        System.out.println(simpleDateFormat.format(date));//1970-01-01 08:00:01

        //获取当前系统前10分钟的时间
        //获取自获取自1970年1月1日00时00分00秒000毫秒到当前的总毫秒 - 10分钟的毫秒数
        Date date1 = new Date(System.currentTimeMillis() - (1000 * 60 * 10));
        System.out.println(simpleDateFormat.format(date1));
    }
}
