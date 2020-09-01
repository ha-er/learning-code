package com.haer.demo05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo03 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo03();
    }

    public JButtonDemo03() {
        Container contentPane = this.getContentPane();
        //将图片变成一个图标//必须保证target中同级目录下也有这个图片文件，否则一直找不到
        URL url = JButtonDemo03.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);
        //多选框
        JCheckBox checkBox01 = new JCheckBox("JCheckBox01");
        JCheckBox checkBox02 = new JCheckBox("JCheckBox02");

        contentPane.add(checkBox01, BorderLayout.NORTH);
        contentPane.add(checkBox02, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
