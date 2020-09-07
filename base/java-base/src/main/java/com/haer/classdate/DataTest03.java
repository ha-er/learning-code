package com.haer.classdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest03 {
    public static void main(String[] args) throws ParseException {

        String strTime = "2020年09月07日 09:09:09:999";
        //将String日期转换为日期类型Date

        //创建日期格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss:SSS");
        Date date = simpleDateFormat.parse(strTime);
        System.out.println(date);
    }
}
