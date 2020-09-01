package com.haer.demo3;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {

    }
}

class KeyFrame extends Frame {
    public KeyFrame() {
        setBounds(100, 100, 200, 200);
        setVisible(true);

        this.addKeyListener(
                new KeyAdapter() {
                    //��д���̰��·���
                    @Override
                    public void keyPressed(KeyEvent e) {
                        //��ü��̵���
                        int keyCode = e.getKeyCode();
                        System.out.println(keyCode);
                        //�жϰ������ϼ�
                        if (keyCode == KeyEvent.VK_UP) {
                            System.out.println("�������ϼ�");
                        }
                    }
                }
        );
    }
}
