package com.haer.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//游戏面板  KeyListener键盘监听器  ActionListener事件监听
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    //定义蛇的数据结构
    int lenght;//长度
    int[] snakeX = new int[600];//x坐标
    int[] snakeY = new int[500];//y坐标
    String fx;//蛇头方向

    //食物的坐标
    int foodX;
    int foodY;
    Random random = new Random();

    //成绩
    int score;

    //游戏状态：开始、停止
    boolean isStart = false;//默认停止
    //游戏是否失败
    boolean isFail = false;//默认不失败

    //定时器
    Timer timer = new Timer(100, this);//100毫秒执行一次

    //构造器
    public GamePanel() {
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//获得键盘监听器
        timer.start();//游戏一开始就启动定时器
    }

    //初始化方法
    public void init() {
        lenght = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;//蛇脑袋坐标
        snakeX[1] = 75;
        snakeY[1] = 100;//第一个身体坐标
        snakeX[2] = 50;
        snakeY[2] = 100;//第二个身体坐标
        fx = "R";//初始方向向右
        score = 0;//成绩初始化0

        foodX = 25 + 25 * random.nextInt(34);
        foodY = 75 + 25 * random.nextInt(24);

    }

    //绘制面板,游戏中的所有东西都是用这个画笔画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏的作用
        //绘制静态面板
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11);
        g.fillRect(25, 75, 850, 600);

        //画积分
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.BOLD, 18));//字体
        g.drawString("积分：" + score, 750, 30);//画的文字
        g.drawString("长度：" + lenght, 750, 55);//画的文字

        //画食物
        Data.food.paintIcon(this, g, foodX, foodY);

        //画小蛇
        //头
        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);//初始脑袋向右
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);//初始脑袋向右
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);//初始脑袋向右
        } else if (fx.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);//初始脑袋向右
        }
        //身体
        for (int i = 1; i < lenght; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }
        //游戏状态
        if (isStart == false) {
            g.setColor(Color.WHITE);//画字颜色
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));//字体
            g.drawString("按下空格开始或暂停游戏", 300, 300);//画的文字
        }
        //画失败界面
        if (isFail) {
            g.setColor(Color.RED);//画字颜色
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));//字体
            g.drawString("失败，按下空格重新开始", 300, 300);//画的文字
        }
    }

    //事件监听--需要通过固定事件来刷新，1s=10次
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && !isFail) {//如果小蛇是开始状态，就让小蛇动

            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                lenght++;//长度加1
                score = score + 10;
                //再次随机食物
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 25 * random.nextInt(24);
            }

            //移动
            //身体
            for (int i = lenght - 1; i > 0; i--) {//后一节移到前一节
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
//            snakeX[0] = snakeX[0]+25;//头部

            //走向
            if (fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;//头部
                if (snakeX[0] > 850) {
                    snakeX[0] = 25;
                }//边界判断
            } else if (fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;//头部
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }//边界判断
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;//头部
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }//边界判断
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;//头部
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }//边界判断
            }

            //失败判定,撞到自己
            for (int i = 1; i < lenght; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                }
            }
            repaint();//重绘
        }
        timer.start();
    }

    //键盘监听器，实现接口方法
    //键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//获得键盘按键码
        if (keyCode == KeyEvent.VK_SPACE) {
            if (isFail) {
                //重新开始
                isFail = false;
                init();
            } else {
                isStart = !isStart;//如果按下空格就改变游戏状态
            }

            repaint();//重绘
        }
        //小蛇移动
        if (keyCode == KeyEvent.VK_UP) {
            if (!fx.equals("D")) {
                fx = "U";
            }
        } else if (keyCode == KeyEvent.VK_DOWN) {
            if (!fx.equals("U")) {
                fx = "D";
            }
        } else if (keyCode == KeyEvent.VK_LEFT) {
            if (!fx.equals("R")) {
                fx = "L";
            }
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            if (!fx.equals("L")) {
                fx = "R";
            }

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}

