package com.haer.demo05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {
    public static void main(String[] args) {
        new JButtonDemo01();
    }

    public JButtonDemo01() {
        Container contentPane = this.getContentPane();
        //��ͼƬ���һ��ͼ��//���뱣֤target��ͬ��Ŀ¼��Ҳ�����ͼƬ�ļ�������һֱ�Ҳ���
        URL url = JButtonDemo01.class.getResource("tx.jpg");
        Icon icon = new ImageIcon(url);
        //��ͼ����ڰ�ť��
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("ͼƬ��ť");

        contentPane.add(button);

        this.setVisible(true);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
