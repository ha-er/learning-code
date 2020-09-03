package com.haer.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable {
    DatagramSocket socket = null;
    private int port;
    private String msg;

    public TalkReceive(int port, String msg) throws SocketException {
        this.port = port;
        this.msg = msg;
        socket = new DatagramSocket(port);
    }

    public void run() {


        while (true) {
            try {
                //准备接收数据
                byte[] bytes = new byte[1024];
                DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
                socket.receive(packet);//等待接收

                //判断断开连接
                byte[] data = packet.getData();
                String dataString = new String(data, 0, data.length);

                System.out.println(msg + ":" + dataString);

                if (dataString.trim().equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        socket.close();
    }
}
