package com.haer.demo05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo02();
    }

    public JButtonDemo02() {
        Container contentPane = this.getContentPane();
        //将图片变成一个图标//必须保证target中同级目录下也有这个图片文件，否则一直找不到
        URL url = JButtonDemo02.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);
        //单选框
        JRadioButton radioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton02 = new JRadioButton("JRadioButton02");
        JRadioButton radioButton03 = new JRadioButton("JRadioButton03");

        //由于单选框只能选择一个，分租，一个组只能选择一个
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton01);
        buttonGroup.add(radioButton02);
        buttonGroup.add(radioButton03);

        contentPane.add(radioButton01, BorderLayout.CENTER);
        contentPane.add(radioButton02, BorderLayout.NORTH);
        contentPane.add(radioButton03, BorderLayout.SOUTH);


        this.setVisible(true);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
