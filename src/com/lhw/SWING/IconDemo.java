package com.lhw.SWING;

import javax.swing.*;
import java.awt.*;

public class IconDemo extends JFrame implements Icon {
    public static void main(String[] args) {
        new IconDemo().init();
    }

    private int width;
    private int height;

    public IconDemo() throws HeadlessException {
    }

    public IconDemo(int width, int height) throws HeadlessException {
        this.width = width;
        this.height = height;
    }

    public void init() {
        IconDemo iconDemo = new IconDemo(30, 30);   //图标放在标签、按钮上
        JLabel jLabel = new JLabel("icon", iconDemo, SwingConstants.CENTER);
        Container contentPane = this.getContentPane();
        contentPane.add(jLabel);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x, y, width, height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
