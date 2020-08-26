package com.haer.demo2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);

        //监听文本框输入的文字
        textField.addActionListener(new MyListen());

        //设置替换编码
        textField.setEchoChar('*');

        setVisible(true);
        pack();
    }
}

class MyListen implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        //获得一些资源,返回一个对象
        TextField textField = (TextField) e.getSource();
        //按回车后获得输入框中的文本
        System.out.println(textField.getText());
        //回车后清楚文本框内容
        textField.setText("");

    }
}