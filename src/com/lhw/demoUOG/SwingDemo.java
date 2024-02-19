package com.lhw.demoUOG;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingDemo extends JFrame {
    public SwingDemo() {
        this.setBounds(0, 0, 1000, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JPanel jPanel = new JPanel();
        mainPanel.add(jPanel);

        jPanel.setLayout(new BorderLayout());


        jPanel.setBackground(Color.black);
        this.getContentPane().add(mainPanel);

        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 20, 30, 40);
        jPanel.setBorder(emptyBorder);

        JLabel north = new JLabel("North");
        JLabel south = new JLabel("South");
        JLabel west = new JLabel("West");
        JLabel east = new JLabel("East");
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        northPanel.add(north);
        northPanel.setBorder(lineBorder);
        southPanel.add(south);
        southPanel.setBorder(lineBorder);
        westPanel.add(west);
        westPanel.setBorder(lineBorder);
        eastPanel.add(east);
        eastPanel.setBorder(lineBorder);
        jPanel.add(northPanel, BorderLayout.NORTH);
        jPanel.add(southPanel, BorderLayout.SOUTH);
        jPanel.add(westPanel, BorderLayout.WEST);
        jPanel.add(eastPanel, BorderLayout.EAST);

        westPanel.setLayout(new GridBagLayout());
        eastPanel.setLayout(new GridBagLayout());

    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
