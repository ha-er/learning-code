package com.haer.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable {
    DatagramSocket socket = null;
    BufferedReader reader = null;

    private int fromPort;
    private String toIP;
    private int toPort;

    public TalkSend(int fromPort, String toIP, int toPort) throws Exception {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;

        socket = new DatagramSocket(fromPort);
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void run() {

        while (true) {
            try {
                //readLine读取输入的一行
                String data = reader.readLine();
                DatagramPacket packet = new DatagramPacket(data.getBytes(), 0, data.getBytes().length, new InetSocketAddress(this.toIP, this.toPort));
                socket.send(packet);
                //trim去首位空格
                if (data.trim().equals("bye")) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
