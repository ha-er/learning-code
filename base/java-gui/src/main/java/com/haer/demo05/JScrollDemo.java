package com.haer.demo05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public static void main(String[] args) {
        new JScrollDemo();
    }

    public JScrollDemo() {
        Container contentPane = this.getContentPane();
        //�ı���
        JTextArea jTextArea = new JTextArea(20, 50);
        jTextArea.setText("����");
        //Scroll���
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        contentPane.add(jScrollPane);

        this.setVisible(true);
        this.setBounds(100, 200, 300, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
