package com.lhw.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame{
    public MyFrame() throws HeadlessException {
        TextField textField = new TextField();
        this.add(textField);

        //监听这个文本框输入的文字
        MyActionListener myActionListener = new MyActionListener();
        textField.addActionListener(myActionListener);      //按下回车就会触发输入框
        textField.setEchoChar('*');     //输入密码用

        this.setVisible(true);
        this.pack();
    }
}

class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource();  //获得资源
        System.out.println(field.getText());    //获得输入框中的文本
        field.setText("");
    }
}