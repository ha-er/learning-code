package com.haer.chat;

public class TalkStudent {
    public static void main(String[] args) throws Exception {
        //开启俩个线程
        new Thread(new TalkSend(7777, "localhost", 9999)).start();
        new Thread(new TalkReceive(8888, "老师")).start();
    }
}
