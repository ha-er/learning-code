package com.haer.demo04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public static void main(String[] args) {
        new ImageIconDemo();
    }

    public ImageIconDemo() {
        //图片标题
        JLabel label = new JLabel("ImageIcon");
        //获取当前目录下的test.png图片地址//必须保证target中同级目录下也有这个图片文件，否则一直找不到
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
