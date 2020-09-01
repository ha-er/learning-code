package com.haer.demo06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestTextDemo01 extends JFrame {
    public static void main(String[] args) {
        new TestTextDemo01();
    }

    public TestTextDemo01() {
        Container contentPane = this.getContentPane();

        JTextField textField = new JTextField("哈儿");
        //还可以设置文本框大小
        JTextField textField2 = new JTextField("haer", 20);

        contentPane.add(textField, BorderLayout.NORTH);
        contentPane.add(textField2, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
