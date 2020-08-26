package com.haer.demo01;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        //Frame
        //设置窗口名称
        Frame frame = new Frame("哈儿的第一个Java图形界面");

        //需要设置窗口的可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400, 400);

        //设置背景颜色
        frame.setBackground(new Color(49, 143, 42));

        //设置弹出初始位置
        frame.setLocation(200, 200);

        //设置大小固定
        frame.setResizable(false);
    }
}
