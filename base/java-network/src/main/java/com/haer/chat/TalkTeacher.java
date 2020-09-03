package com.haer.chat;

public class TalkTeacher {
    public static void main(String[] args) throws Exception {
        //开启俩个线程
        new Thread(new TalkSend(5555, "localhost", 8888)).start();
        new Thread(new TalkReceive(9999, "学生")).start();
    }
}
