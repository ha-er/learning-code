package com.haer.demo01;

import java.awt.*;

//封装一个弹窗工具
public class MyFrame extends Frame {
    static int id = 0;//可能存在多个窗口，用来计数

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("MyFrame" + (++id));//每次new调用父类构造方法，id＋1
        setBackground(color);
        setBounds(x, y, w, h);
        setVisible(true);
    }
}
