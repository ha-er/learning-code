package com.haer.demo04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public static void main(String[] args) {
        new ImageIconDemo();
    }

    public ImageIconDemo() {
        //ͼƬ����
        JLabel label = new JLabel("ImageIcon");
        //��ȡ��ǰĿ¼�µ�test.pngͼƬ��ַ//���뱣֤target��ͬ��Ŀ¼��Ҳ�����ͼƬ�ļ�������һֱ�Ҳ���
        URL url = ImageIconDemo.class.getResource("tx.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container contentPane = getContentPane();
        contentPane.add(label);

        setVisible(true);
        setBounds(100, 100, 300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
