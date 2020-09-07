package com.haer.classnumber;

import java.math.BigDecimal;

public class NumberTest02 {
    public static void main(String[] args) {
        //这个类型的数据精确度极高，在财务运算时，使用该类
        //创建使用value值初始化
        BigDecimal numValue1 = new BigDecimal(40.00);
        BigDecimal numValue2 = new BigDecimal(20.00);
        BigDecimal numValue3 = new BigDecimal(-100);
        //尽量用字符串的形式初始化
        BigDecimal numString1 = new BigDecimal("40.00");
        BigDecimal numString2 = new BigDecimal("20.00");
        BigDecimal numString3 = new BigDecimal("-100");

        //加法 40+20
        BigDecimal resultValue1 = numValue1.add(numValue2);
        BigDecimal resultString1 = numString1.add(numString2);
        //减法 40-20
        BigDecimal resultValue2 = numValue1.subtract(numValue2);
        BigDecimal resultString2 = numString1.subtract(numString2);
        //乘法 40*20
        BigDecimal resultValue3 = numValue1.multiply(numValue2);
        BigDecimal resultString3 = numString1.multiply(numString2);
        //绝对值 |-100|
        BigDecimal resultValue4 = numValue3.abs();
        BigDecimal resultString4 = numString3.abs();
        //除法 40/20 保留五位小数 舍入模式
        BigDecimal resultValue5 = numValue1.divide(numValue2, 5, BigDecimal.ROUND_HALF_UP);
        BigDecimal resultString5 = numString1.divide(numString2, 5, BigDecimal.ROUND_HALF_UP);

        System.out.println("加法用value结果：" + resultValue1);
        System.out.println("加法用string结果：" + resultString1);

        System.out.println("减法value结果：" + resultValue2);
        System.out.println("减法用string结果：" + resultString2);

        System.out.println("乘法用value结果：" + resultValue3);
        System.out.println("乘法用string结果：" + resultString3);

        System.out.println("绝对值用value结果：" + resultValue4);
        System.out.println("绝对值用string结果：" + resultString4);

        System.out.println("除法用value结果：" + resultValue5);
        System.out.println("除法用string结果：" + resultString5);

    }


}
