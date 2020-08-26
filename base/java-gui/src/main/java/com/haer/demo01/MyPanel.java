package com.haer.demo01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyPanel {
    public static void main(String[] args) {
//        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();

        //直接使用封装的模板了
        MyFrame myFrame = new MyFrame(300, 300, 500, 500, new Color(40, 161, 35));

        //设置布局,暂时设置null
        myFrame.setLayout(null);

        //panel设置坐标，相对于frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(193, 15, 60));

        //frame.add(panel)add加入到frame
        myFrame.add(panel);

        //监听事件：监听窗口关闭事件 System.exit(0)
        //这样点击右上角可以关闭窗口了
        myFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
