package com.haer.demo04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo {
    public static void main(String[] args) {
        new MyJFrame2();
    }
}

class MyJFrame2 extends JFrame {
    public MyJFrame2() {
        setVisible(true);
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame����һ������
        Container contentPane = this.getContentPane();
        //���Բ���
        contentPane.setLayout(null);
        //��ť
        JButton button = new JButton("�������");
        button.setBounds(30, 30, 200, 50);
        //��ť�����¼�������һ������
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //����
                        new MyDialogDemo();
                    }
                }
        );
        //�Ѱ�ť��ӵ�����
        contentPane.add(button);
    }
}

//����
class MyDialogDemo extends JDialog {
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);
        //����Ĭ�϶��йرմ��ڵĹ������Բ���Ҫ
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        contentPane.add(new Label("����һ����������"));
    }
}


