package com.haer.demo06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo02 extends JFrame {
    public static void main(String[] args) {
        new TestTextDemo02();
    }

    public TestTextDemo02() {
        Container contentPane = this.getContentPane();

        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');

        contentPane.add(passwordField);

        this.setVisible(true);
        this.setSize(500, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
