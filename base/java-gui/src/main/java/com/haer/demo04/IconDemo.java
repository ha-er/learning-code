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
        //图片放在标签上，也可以放在按钮上
        //标题，图标，居中
        JLabel label = new JLabel("iconTest", iconDemo, SwingConstants.CENTER);
        //放在容器中
        Container contentPane = getContentPane();
        contentPane.add(label);
        //设置
        this.setVisible(true);
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //画一个实心圆
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
