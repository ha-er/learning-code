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
                    //重写键盘按下方法
                    @Override
                    public void keyPressed(KeyEvent e) {
                        //获得键盘的码
                        int keyCode = e.getKeyCode();
                        System.out.println(keyCode);
                        //判断按下了上键
                        if (keyCode == KeyEvent.VK_UP) {
                            System.out.println("按下了上键");
                        }
                    }
                }
        );
    }
}
