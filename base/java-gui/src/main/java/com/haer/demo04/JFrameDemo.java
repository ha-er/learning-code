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
        //����Ƕ�������JFrame����ɫ
        setBackground(Color.CYAN);
        JLabel label = new JLabel("ϲ��͵���Ĺ���");
        //��������
        add(label);
        //�������־���
        label.setHorizontalAlignment(SwingConstants.CENTER);
        //�������label����ɫ����Ϊlabel��ȫ�����ڴ���JFrame�ϲ���
        getContentPane().setBackground(Color.red);
        //�ر��¼�
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
