package com.haer.demo09;

//继承Exception自定义异常
public class MyException extends Exception {
    //传递数字>10抛出异常
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "抛出异常>传递参数过大：" + detail;
    }
}
