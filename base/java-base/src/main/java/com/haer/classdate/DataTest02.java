package com.haer.classdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest02 {
    public static void main(String[] args) {
        //获取当前系统时间
        Date date = new Date();
        System.out.println(date);//Mon Sep 07 09:38:17 CST 2020
        //我们可以看出java.util.Date；已经重写了Object的toString方法
        //但是对于中国人来说我们还是不满意这样的

        //所以我们引入“格式化”日期
        /*
        日期格式：
        y 年
        M 月
        d 日
        H 小时
        m 分
        s 秒
        S 毫秒
         */
        //创建日期格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //开始格式化
        String formatTime = simpleDateFormat.format(date);
        System.out.println(formatTime);//2020-09-07 09:46:35:351
    }
}
