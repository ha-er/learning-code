package com.haer.demo01;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame(300, 300, 500, 500, new Color(40, 161, 35));

        Button east = new Button("east");
        Button west = new Button("west");
        Button south = new Button("south");
        Button north = new Button("north");
        Button center = new Button("center");

        myFrame.add(east, BorderLayout.EAST);
        myFrame.add(west, BorderLayout.WEST);
        myFrame.add(south, BorderLayout.SOUTH);
        myFrame.add(north, BorderLayout.NORTH);
        myFrame.add(center, BorderLayout.CENTER);

    }
}
