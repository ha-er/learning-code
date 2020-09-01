package com.haer.demo3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("��ͼ");
    }
}

class MyFrame extends Frame {
    //��������ĵ�
    ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(200, 200, 400, 300);
        //��������ĵ�
        points = new ArrayList<>();
        //�������������Դ���
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //������������¼�
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            //�����ɫ����С
            g.setColor(Color.blue);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    //���һ���㵽������
    public void addPoint(Point point) {
        points.add(point);
    }

    //������ģʽ
    private class MyMouseListener extends MouseAdapter {
        //��꣬���£�����
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            //������ʱ�ڽ����ϻ�һ����
            //������λ�þ�������λ��
            myFrame.addPoint(new Point(e.getX(), e.getY()));

            //ÿ�ε�������Ҫ���»�һ��
            myFrame.repaint();
        }
    }
}