package com.haer.demo04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    public static void main(String[] args) {
        new MyJFrame();
    }
}

class MyJFrame extends JFrame {
    public MyJFrame() {
        setVisible(true);
        setBounds(100, 100, 200, 200);
        //这个是顶级窗口JFrame的颜色
        setBackground(Color.CYAN);
        JLabel label = new JLabel("喜欢偷懒的哈儿");
        //设置文字
        add(label);
        //设置文字居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //设置这个label的颜色，因为label完全覆盖在窗口JFrame上层了
        getContentPane().setBackground(Color.red);
        //关闭事件
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
