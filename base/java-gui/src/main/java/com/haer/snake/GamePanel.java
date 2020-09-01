package com.haer.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//��Ϸ���  KeyListener���̼�����  ActionListener�¼�����
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    //�����ߵ����ݽṹ
    int lenght;//����
    int[] snakeX = new int[600];//x����
    int[] snakeY = new int[500];//y����
    String fx;//��ͷ����

    //ʳ�������
    int foodX;
    int foodY;
    Random random = new Random();

    //�ɼ�
    int score;

    //��Ϸ״̬����ʼ��ֹͣ
    boolean isStart = false;//Ĭ��ֹͣ
    //��Ϸ�Ƿ�ʧ��
    boolean isFail = false;//Ĭ�ϲ�ʧ��

    //��ʱ��
    Timer timer = new Timer(100, this);//100����ִ��һ��

    //������
    public GamePanel() {
        init();
        //��ý���ͼ����¼�
        this.setFocusable(true);//��ý����¼�
        this.addKeyListener(this);//��ü��̼�����
        timer.start();//��Ϸһ��ʼ��������ʱ��
    }

    //��ʼ������
    public void init() {
        lenght = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;//���Դ�����
        snakeX[1] = 75;
        snakeY[1] = 100;//��һ����������
        snakeX[2] = 50;
        snakeY[2] = 100;//�ڶ�����������
        fx = "R";//��ʼ��������
        score = 0;//�ɼ���ʼ��0

        foodX = 25 + 25 * random.nextInt(34);
        foodY = 75 + 25 * random.nextInt(24);

    }

    //�������,��Ϸ�е����ж���������������ʻ�
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//����������
        //���ƾ�̬���
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11);
        g.fillRect(25, 75, 850, 600);

        //������
        g.setColor(Color.WHITE);
        g.setFont(new Font("΢���ź�", Font.BOLD, 18));//����
        g.drawString("���֣�" + score, 750, 30);//��������
        g.drawString("���ȣ�" + lenght, 750, 55);//��������

        //��ʳ��
        Data.food.paintIcon(this, g, foodX, foodY);

        //��С��
        //ͷ
        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);//��ʼ�Դ�����
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);//��ʼ�Դ�����
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);//��ʼ�Դ�����
        } else if (fx.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);//��ʼ�Դ�����
        }
        //����
        for (int i = 1; i < lenght; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }
        //��Ϸ״̬
        if (isStart == false) {
            g.setColor(Color.WHITE);//������ɫ
            g.setFont(new Font("΢���ź�", Font.BOLD, 40));//����
            g.drawString("���¿ո�ʼ����ͣ��Ϸ", 300, 300);//��������
        }
        //��ʧ�ܽ���
        if (isFail) {
            g.setColor(Color.RED);//������ɫ
            g.setFont(new Font("΢���ź�", Font.BOLD, 40));//����
            g.drawString("ʧ�ܣ����¿ո����¿�ʼ", 300, 300);//��������
        }
    }

    //�¼�����--��Ҫͨ���̶��¼���ˢ�£�1s=10��
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && !isFail) {//���С���ǿ�ʼ״̬������С�߶�

            //��ʳ��
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                lenght++;//���ȼ�1
                score = score + 10;
                //�ٴ����ʳ��
                foodX = 25 + 25 * random.nextInt(34);
                foodY = 75 + 25 * random.nextInt(24);
            }

            //�ƶ�
            //����
            for (int i = lenght - 1; i > 0; i--) {//��һ���Ƶ�ǰһ��
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
//            snakeX[0] = snakeX[0]+25;//ͷ��

            //����
            if (fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;//ͷ��
                if (snakeX[0] > 850) {
                    snakeX[0] = 25;
                }//�߽��ж�
            } else if (fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;//ͷ��
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }//�߽��ж�
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;//ͷ��
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }//�߽��ж�
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;//ͷ��
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }//�߽��ж�
            }

            //ʧ���ж�,ײ���Լ�
            for (int i = 1; i < lenght; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                }
            }
            repaint();//�ػ�
        }
        timer.start();
    }

    //���̼�������ʵ�ֽӿڷ���
    //���̼����¼�
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//��ü��̰�����
        if (keyCode == KeyEvent.VK_SPACE) {
            if (isFail) {
                //���¿�ʼ
                isFail = false;
                init();
            } else {
                isStart = !isStart;//������¿ո�͸ı���Ϸ״̬
            }

            repaint();//�ػ�
        }
        //С���ƶ�
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

