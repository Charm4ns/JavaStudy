package com.lhw.SWING;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(0, 0, 1000, 1000);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        JTextArea jTextArea = new JTextArea(20, 50);
        jTextArea.setText("test");
        JScrollPane jScrollPane = new JScrollPane(jTextArea);   //加入滚动条面板
        contentPane.add(jScrollPane);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
