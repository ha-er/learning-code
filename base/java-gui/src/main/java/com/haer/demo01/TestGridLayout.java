package com.haer.demo01;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame(300, 300, 500, 500, new Color(40, 161, 35));

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");

        myFrame.setLayout(new GridLayout(3, 2));

        myFrame.add(button1);
        myFrame.add(button2);
        myFrame.add(button3);
        myFrame.add(button4);
        myFrame.add(button5);
        myFrame.add(button6);

        myFrame.pack();//java函数，自动布局，可以不加
    }
}
