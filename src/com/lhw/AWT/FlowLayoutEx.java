package com.lhw.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutEx {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2, 1));

        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2, 1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2, 2));
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");
        Button btn7 = new Button("btn7");
        Button btn8 = new Button("btn8");
        Button btn9 = new Button("btn9");
        Button btn10 = new Button("btn10");


        panel1.add(btn1, BorderLayout.WEST);
        panel1.add(btn2, BorderLayout.EAST);
        panel2.add(btn3);
        panel2.add(btn4);
        panel1.add(panel2, BorderLayout.CENTER);
        frame.add(panel1);


        panel3.add(btn5, BorderLayout.WEST);
        panel3.add(btn6, BorderLayout.EAST);
        panel4.add(btn7);
        panel4.add(btn8);
        panel4.add(btn9);
        panel4.add(btn10);
        panel3.add(panel4, BorderLayout.CENTER);
        frame.add(panel3);


        frame.setVisible(true);
        frame.setBounds(0, 0, 1000, 1000);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
