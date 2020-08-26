package com.haer.demo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
//        e.getActionCommand()获得按钮信息
        System.out.println("哈儿" + e.getActionCommand());
    }
}
