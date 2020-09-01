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
        //��ͼƬ���һ��ͼ��//���뱣֤target��ͬ��Ŀ¼��Ҳ�����ͼƬ�ļ�������һֱ�Ҳ���
        URL url = JButtonDemo03.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);
        //��ѡ��
        JCheckBox checkBox01 = new JCheckBox("JCheckBox01");
        JCheckBox checkBox02 = new JCheckBox("JCheckBox02");

        contentPane.add(checkBox01, BorderLayout.NORTH);
        contentPane.add(checkBox02, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
