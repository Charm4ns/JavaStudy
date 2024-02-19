package com.lhw.AWT;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}


class KeyFrame extends Frame{
    public KeyFrame(){
        setVisible(true);
        pack();
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}
