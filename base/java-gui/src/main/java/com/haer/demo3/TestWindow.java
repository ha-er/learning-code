package com.haer.demo3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.CYAN);
        setBounds(100, 100, 200, 200);
        setVisible(true);

        addWindowListener(
                //匿名内部类
                new WindowAdapter() {
                    //这里重写俩个使用较多的方法
                    //关闭窗口,点击x时调用
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("windowClosing");
                        System.exit(0);//正常关闭程序
                    }

                    //激活窗口
                    @Override
                    public void windowActivated(WindowEvent e) {
                        System.out.println("windowActivated");
                    }
                }
        );
    }
}
