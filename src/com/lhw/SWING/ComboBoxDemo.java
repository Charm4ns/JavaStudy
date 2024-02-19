package com.lhw.SWING;

import javax.swing.*;
import java.awt.*;

public class ComboBoxDemo extends JFrame {
    public ComboBoxDemo() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(0,0,1000,1000);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("1");
        jComboBox.addItem("2");
        jComboBox.addItem("3");
        jComboBox.addItem("4");


        contentPane.add(jComboBox);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
