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

        //�����б������
        //String[] container = {"1", "2", "3"};//����
        Vector vector = new Vector();
        //�б�����Ҫ��������
        JList jList = new JList(vector);

        vector.add("����");
        vector.add("20");
        vector.add("��");

        contentPane.add(jList);

        this.setVisible(true);
        this.setSize(500, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
