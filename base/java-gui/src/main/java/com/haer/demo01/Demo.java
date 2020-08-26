package com.haer.demo01;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame(300, 300, 500, 500, new Color(40, 161, 35));

        myFrame.setLayout(new GridLayout(2, 1));

        //四个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2, 1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2, 2));

        //上班部分
        panel1.add(new Button("East-1"), BorderLayout.EAST);
        panel1.add(new Button("West-1"), BorderLayout.WEST);
        panel2.add(new Button("p2-btn-1"));
        panel2.add(new Button("p2-btn-2"));
        panel1.add(panel2, BorderLayout.CENTER);

        //下半部分
        panel3.add(new Button("East-2"), BorderLayout.EAST);
        panel3.add(new Button("West-2"), BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            panel4.add(new Button("for-" + i));
        }
        panel3.add(panel4, BorderLayout.CENTER);

        myFrame.add(panel1);
        myFrame.add(panel3);

    }
}
