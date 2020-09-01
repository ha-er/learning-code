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
        //��ɫ
        g.setColor(Color.red);
        //��һ��Բ
        g.drawOval(100, 100, 100, 100);
        //ʵ��Բ
        g.fillOval(200, 100, 100, 100);

        g.setColor(Color.green);
        //����
        g.fillRect(150, 200, 200, 200);

        //�������껹ԭ���������ɫ
        g.setColor(Color.black);
    }
}
