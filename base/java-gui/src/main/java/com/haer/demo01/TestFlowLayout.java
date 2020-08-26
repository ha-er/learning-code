package com.haer.demo01;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame(300, 300, 500, 500, new Color(40, 161, 35));

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        //设置流式布局，设置左右居中
        myFrame.setLayout(new FlowLayout());
//        myFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        myFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
//        myFrame.setLayout(new FlowLayout(FlowLayout.CENTER));

        //添加按钮
        myFrame.add(button1);
        myFrame.add(button2);
        myFrame.add(button3);

    }
}
