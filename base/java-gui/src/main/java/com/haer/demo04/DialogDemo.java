package com.haer.demo04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo {
    public static void main(String[] args) {
        new MyJFrame2();
    }
}

class MyJFrame2 extends JFrame {
    public MyJFrame2() {
        setVisible(true);
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame设置一个容器
        Container contentPane = this.getContentPane();
        //绝对布局
        contentPane.setLayout(null);
        //按钮
        JButton button = new JButton("点击弹出");
        button.setBounds(30, 30, 200, 50);
        //按钮监听事件，弹出一个弹出
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //弹窗
                        new MyDialogDemo();
                    }
                }
        );
        //把按钮添加到容器
        contentPane.add(button);
    }
}

//弹窗
class MyDialogDemo extends JDialog {
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);
        //弹窗默认都有关闭窗口的功能所以不需要
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        contentPane.add(new Label("这是一个弹出窗口"));
    }
}


