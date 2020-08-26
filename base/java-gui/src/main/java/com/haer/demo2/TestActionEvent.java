package com.haer.demo2;

import com.haer.demo01.MyFrame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    //按下按钮，触发一些事件
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        //可以显示的定义触发会返回的命名，不定义，会走默认值
        button1.setActionCommand("button1");
        button2.setActionCommand("button2");

        //因为，addActionListener（）需要一个ActionListener，所以我们需要构造一个ActionListener
        MyActionListener myActionListener = new MyActionListener();
        button1.addActionListener(myActionListener);
        button2.addActionListener(myActionListener);

        frame.add(button1, BorderLayout.CENTER);
        frame.add(button2, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);

        windowClose(frame);

    }

    //关闭窗口方法
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
