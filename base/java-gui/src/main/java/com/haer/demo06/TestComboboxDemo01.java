package com.haer.demo06;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo01 extends JFrame {
    public static void main(String[] args) {
        new TestComboboxDemo01();
    }

    public TestComboboxDemo01() {
        Container contentPane = this.getContentPane();

        JComboBox jComboBox = new JComboBox();

        jComboBox.addItem("正在热映");
        jComboBox.addItem(null);
        jComboBox.addItem("已下架");
        jComboBox.addItem("即将上映");

        contentPane.add(jComboBox);

        this.setVisible(true);
        this.setSize(500, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
