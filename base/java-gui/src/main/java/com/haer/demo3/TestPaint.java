package com.haer.demo3;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {

    public void loadFrame() {
        setBounds(200, 200, 600, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //颜色
        g.setColor(Color.red);
        //画一个圆
        g.drawOval(100, 100, 100, 100);
        //实心圆
        g.fillOval(200, 100, 100, 100);

        g.setColor(Color.green);
        //矩形
        g.fillRect(150, 200, 200, 200);

        //画笔用完还原到最初的颜色
        g.setColor(Color.black);
    }
}
