package com.lhw.SWING;

import javax.swing.*;
import java.awt.*;

public class TestJFrame {
    public static void main(String[] args) {
        new TestJFrame().init();
    }

    public void init(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(100,200,300,300);

        JLabel jLabel = new JLabel("123456");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);   //设置水平居中

        jFrame.add(jLabel);
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);     //设置颜色需要实例化容器


        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);     //关闭事件
    }
}
