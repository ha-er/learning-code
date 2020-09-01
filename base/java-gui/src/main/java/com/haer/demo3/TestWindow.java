package com.haer.demo3;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.CYAN);
        setBounds(100, 100, 200, 200);
        setVisible(true);

        addWindowListener(
                //�����ڲ���
                new WindowAdapter() {
                    //������д����ʹ�ý϶�ķ���
                    //�رմ���,���xʱ����
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("windowClosing");
                        System.exit(0);//�����رճ���
                    }

                    //�����
                    @Override
                    public void windowActivated(WindowEvent e) {
                        System.out.println("windowActivated");
                    }
                }
        );
    }
}
