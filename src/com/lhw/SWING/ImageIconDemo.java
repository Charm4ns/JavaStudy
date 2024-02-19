package com.lhw.SWING;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo(){
        JLabel jLabel = new JLabel();
        URL resource = ImageIconDemo.class.getResource("lhw.jpg");      //图片在同一目录下，获取地址
        ImageIcon imageIcon = new ImageIcon(resource);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        Container contentPane = this.getContentPane();
        contentPane.add(jLabel);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
