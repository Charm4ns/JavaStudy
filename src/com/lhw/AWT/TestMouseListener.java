package com.lhw.AWT;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyMousePainter("painter");
    }
}


class MyMousePainter extends Frame {
    ArrayList points;

    public MyMousePainter(String name) throws HeadlessException {
        super(name);
        setBounds(200, 200, 600, 600);
        setVisible(true);
        pack();
        this.addMouseListener(new MyMouseListener());

        points = new ArrayList<>();
    }

    @Override
    public void paint(Graphics g) {
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    public void addPaint(Point point){
        points.add(point);
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            MyMousePainter myMousePainter = (MyMousePainter) e.getSource();

            myMousePainter.addPaint(new Point(e.getX(),e.getY()));

            myMousePainter.repaint();
        }
    }
}