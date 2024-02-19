package com.lhw.SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJDialog extends JFrame {
    public TestJDialog() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(0, 0, 200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        JButton jButton = new JButton("弹出");
        jButton.setBounds(30,30,200,50);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });

        contentPane.add(jButton);
    }

    public static void main(String[] args) {
        new TestJDialog();
    }
}

class MyDialog extends JDialog{
    public MyDialog() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);       //已经声明过了，不需要这一句
        Container contentPane = this.getContentPane();

        JLabel jLabel = new JLabel("12345");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(jLabel);
    }
}