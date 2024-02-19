package com.lhw.Tanchishe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

    public GamePanel() {
        init();
        this.setFocusable(true);    //获得焦点事件
        this.addKeyListener(this);
        timer.start();
    }

    Random random = new Random();
    int snakeLength;
    int foodX, foodY;   //食物坐标
    int[] snakeX = new int[600];
    int[] snakeY = new int[600];
    String fx;
    boolean isStart;
    boolean isFail = false;
    int score;
    Timer timer = new Timer(80, this);     //100毫秒执行一次

    public void init() {
        fx = "R";
        isStart = false;    //游戏默认不开始
        snakeLength = 3;
        snakeX[0] = 100;
        snakeX[1] = 75;
        snakeX[2] = 50;
        snakeY[0] = 100;
        snakeY[1] = 100;
        snakeY[2] = 100;
        score = 0;

        foodX = 25 + 25 * random.nextInt(34);
        foodY = 75 + 25 * random.nextInt(24);
    }

    //游戏中所有东西都用这个画笔画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11);
        g.fillRect(25, 75, 850, 600);

        //画积分
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.BOLD, 18));
        g.drawString("长度" + snakeLength, 750, 35);
        g.drawString("分数" + score, 750, 50);

        Data.food.paintIcon(this, g, foodX, foodY);

        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);
        } else {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }

        for (int i = 1; i < snakeLength; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }



        if (!isStart) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 300, 300);
        }
        if (isFail) {
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("失败，按下空格重新开始", 300, 300);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE) {
            if (isFail) {
                isFail = false;
                init();
            } else {
                isStart = !isStart;
            }

            repaint();
        }
        //小蛇移动
        if (keyCode == KeyEvent.VK_UP) {
            fx = "U";
        } else if (keyCode == KeyEvent.VK_DOWN) {
            fx = "D";
        } else if (keyCode == KeyEvent.VK_LEFT) {
            fx = "L";
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            fx = "R";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //事件监听，一秒十次
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart == true && isFail == false) {
            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                snakeLength++;
                score += 10;
                //再生成一个食物
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 25 * random.nextInt(24);
            }
            //移动
            for (int i = snakeLength - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];      //身体每一格向前移动一截
                snakeY[i] = snakeY[i - 1];
            }

            if (fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                //边界判断
                if (snakeX[0] > 850) {
                    snakeX[0] = 25;
                }
            } else if (fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;
                //边界判断
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;
                //边界判断
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;
                //边界判断
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }
            }
            //失败判定，撞到自己就算失败
            for (int i = 1; i < snakeLength; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                }
            }
            repaint();
        }
    }
}

