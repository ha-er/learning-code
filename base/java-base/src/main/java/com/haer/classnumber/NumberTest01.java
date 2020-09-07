package com.haer.classnumber;

import java.text.DecimalFormat;

public class NumberTest01 {
    public static void main(String[] args) {

        //创建数字格式化对象
        //加入千分位（三位数一个逗号）
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        //开始格式化
        System.out.println(decimalFormat.format(2000000000.16));//2,000,000,000

        //加入千分位，并保留一位小数
        DecimalFormat decimalFormat2 = new DecimalFormat("###,###.#");
        System.out.println(decimalFormat2.format(2000000000.16));//2,000,000,000

        //加入千分位，并保留2位小数,不够补零
        DecimalFormat decimalFormat3 = new DecimalFormat("###,###.00");
        System.out.println(decimalFormat3.format(2000000000.1));//2,000,000,000
    }
}
