package com.lhw.AWT;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {

    public void loadFrame() {
        setBounds(200, 200, 600, 600);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(100, 100, 100, 100);
        g.fillOval(200, 200, 100, 100);

        //养成习惯，画笔用完恢复原来的颜色
    }
}
