package com.lhw.AWT;

import java.awt.*;

public class MyFrame1 extends Frame {
    private static int id = 0;

    public MyFrame1(int a, int b, int c, int d, Color color){
        super("MyFrame" + ++id);
        setVisible(true);
        setBounds(a,b,c,d);
        setBackground(color);
        setResizable(false);
    }
}
