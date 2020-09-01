package com.haer.demo06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboboxDemo02 extends JFrame {
    public static void main(String[] args) {
        new TestComboboxDemo02();
    }

    public TestComboboxDemo02() {
        Container contentPane = this.getContentPane();

        //生成列表的内容
        //String[] container = {"1", "2", "3"};//数组
        Vector vector = new Vector();
        //列表中需要放入内容
        JList jList = new JList(vector);

        vector.add("哈儿");
        vector.add("20");
        vector.add("男");

        contentPane.add(jList);

        this.setVisible(true);
        this.setSize(500, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
