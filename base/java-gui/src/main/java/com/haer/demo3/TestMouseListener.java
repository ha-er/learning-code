package com.haer.demo3;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

class MyFrame extends Frame {
    //存鼠标点击的点
    ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(200, 200, 400, 300);
        //存鼠标点击的点
        points = new ArrayList<>();
        //鼠标监听器，正对窗口
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //画画监听鼠标事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            //点的颜色，大小
            g.setColor(Color.blue);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    //添加一个点到界面上
    public void addPoint(Point point) {
        points.add(point);
    }

    //适配器模式
    private class MyMouseListener extends MouseAdapter {
        //鼠标，按下，弹起
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            //这里点击时在界面上画一个点
            //这个点的位置就是鼠标的位置
            myFrame.addPoint(new Point(e.getX(), e.getY()));

            //每次点击鼠标需要重新画一遍
            myFrame.repaint();
        }
    }
}