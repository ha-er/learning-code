package com.haer.snake;

import javax.swing.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setBounds(10, 10, 900, 720);
        frame.setResizable(false);//���ڴ�С���ɱ�
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //��Ϸ�ŵ������
        frame.add(new GamePanel());

        frame.setVisible(true);
    }
}
