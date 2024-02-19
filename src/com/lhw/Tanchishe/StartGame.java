package com.lhw.Tanchishe;

import javax.swing.*;

public class StartGame {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setBounds(10, 10, 900, 720);
        jFrame.setResizable(false);

    jFrame.add(new GamePanel());
    }
}
