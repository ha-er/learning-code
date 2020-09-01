package com.haer.demo04;

import javax.swing.*;
import java.awt.*;

public class IconDemo extends JFrame implements Icon {

    private int width;
    private int height;

    public IconDemo() {
    }

    public IconDemo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {
        IconDemo iconDemo = new IconDemo(15, 15);
        //ͼƬ���ڱ�ǩ�ϣ�Ҳ���Է��ڰ�ť��
        //���⣬ͼ�꣬����
        JLabel label = new JLabel("iconTest", iconDemo, SwingConstants.CENTER);
        //����������
        Container contentPane = getContentPane();
        contentPane.add(label);
        //����
        this.setVisible(true);
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //��һ��ʵ��Բ
        g.fillOval(x, y, width, height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
