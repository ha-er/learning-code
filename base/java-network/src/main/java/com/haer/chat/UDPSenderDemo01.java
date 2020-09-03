package com.haer.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSenderDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(8888);

        //准备数据，从控制台读取System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            //readLine读取输入的一行
            String data = reader.readLine();
            DatagramPacket packet = new DatagramPacket(data.getBytes(), 0, data.getBytes().length, new InetSocketAddress("localhost", 6666));

            datagramSocket.send(packet);
            //trim去首位空格
            if (data.trim().equals("bye")) {
                break;
            }
        }


        reader.close();
        datagramSocket.close();
    }
}
