package com.haer.string;

public class StringTest03 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();//默认16

        //因为StringBuffer是可变的，频繁拼接不会新创建字符串对象
        //所以需要频繁拼接的时候，使用StringBuffer
        for (int i = 0; i < 10; i++) {
            stringBuffer.append("哈儿" + i);
        }
        System.out.println(stringBuffer);
    }
}
