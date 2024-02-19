package com.lhw.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//内部类写法，内部类可以畅通无阻访问外部类的属性和方法。
public class TestCalc {
    public static void main(String[] args) {
        new Calc().loadCalc();
    }
}

class Calc extends Frame {
    TextField num1, num2, result;
    Button button;
    Label label;

    public void loadCalc() {
        //三个文本框，一个按钮，一个标签
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(20);

        button = new Button("=");
        button.addActionListener(new MyCalcListener());

        label = new Label("+");

        this.setLayout(new FlowLayout());

        this.add(num1);
        this.add(label);
        this.add(num2);
        this.add(button);
        this.add(result);

        this.setVisible(true);
        this.pack();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private class MyCalcListener implements ActionListener {

        Calc calc = null;



        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            result.setText("" + (a + b));
            num1.setText("");
            num2.setText("");
        }
    }
}

