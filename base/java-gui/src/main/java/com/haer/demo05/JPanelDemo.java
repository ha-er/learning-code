package com.haer.demo05;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    public static void main(String[] args) {
        new JPanelDemo();
    }

    public JPanelDemo() {
        Container contentPane = this.getContentPane();
        //设置GridLayout表格布局，2行2列，后面俩个是间距
        contentPane.setLayout(new GridLayout(2, 2, 10, 10));

        JPanel jPanel = new JPanel(new GridLayout(1, 3));
        JPanel jPane2 = new JPanel(new GridLayout(1, 2));
        JPanel jPane3 = new JPanel(new GridLayout(2, 1));
        JPanel jPane4 = new JPanel(new GridLayout(3, 2));

        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("1"));
        jPane2.add(new JButton("2"));
        jPane2.add(new JButton("2"));
        jPane3.add(new JButton("3"));
        jPane3.add(new JButton("3"));
        jPane4.add(new JButton("4"));
        jPane4.add(new JButton("4"));
        jPane4.add(new JButton("4"));
        jPane4.add(new JButton("4"));
        jPane4.add(new JButton("4"));
        jPane4.add(new JButton("4"));

        contentPane.add(jPanel);
        contentPane.add(jPane2);
        contentPane.add(jPane3);
        contentPane.add(jPane4);

        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
