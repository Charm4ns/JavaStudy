package com.lhw.AWT;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        frame.setLayout(new FlowLayout(FlowLayout.LEFT));   //流式布局
        frame.setVisible(true);
        frame.setBounds(0, 0, 300, 300);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);


        Frame frame1 = new Frame();
        Button west = new Button("west");
        Button east = new Button("east");
        Button north = new Button("north");
        Button south = new Button("south");

        frame1.add(east, BorderLayout.EAST);    //东西南北中
        frame1.add(west, BorderLayout.WEST);
        frame1.add(south, BorderLayout.SOUTH);
        frame1.add(north, BorderLayout.NORTH);

        frame1.setVisible(true);
        frame1.setBounds(500, 500 , 300, 300);


        Frame frame2 = new Frame();
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");

        frame2.setLayout(new GridLayout(3,2));
        frame2.add(btn1);
        frame2.add(btn2);
        frame2.add(btn3);
        frame2.add(btn4);
        frame2.add(btn5);

        frame2.setVisible(true);
        frame2.setBounds(1000,1000,500,500);
//        frame2.pack();    //可以自动填充
    }
}
