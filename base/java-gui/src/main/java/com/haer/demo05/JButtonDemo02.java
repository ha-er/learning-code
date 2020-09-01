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
        //��ͼƬ���һ��ͼ��//���뱣֤target��ͬ��Ŀ¼��Ҳ�����ͼƬ�ļ�������һֱ�Ҳ���
        URL url = JButtonDemo02.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);
        //��ѡ��
        JRadioButton radioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton02 = new JRadioButton("JRadioButton02");
        JRadioButton radioButton03 = new JRadioButton("JRadioButton03");

        //���ڵ�ѡ��ֻ��ѡ��һ�������⣬һ����ֻ��ѡ��һ��
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
