package com.lhw.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();


        frame.setLayout(null);
        frame.setBounds(0,0,300,300);
        frame.setBackground(new Color(1,1,1));


        panel.setBounds(50,50,200,200);
        panel.setBackground(new Color(23, 73, 165));

        frame.add(panel);
        frame.setVisible(true);

        //监听窗口关闭
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
