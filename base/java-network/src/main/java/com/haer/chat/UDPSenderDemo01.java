package com.haer.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPSenderDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(8888);

        //׼�����ݣ��ӿ���̨��ȡSystem.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            //readLine��ȡ�����һ��
            String data = reader.readLine();
            DatagramPacket packet = new DatagramPacket(data.getBytes(), 0, data.getBytes().length, new InetSocketAddress("localhost", 6666));

            datagramSocket.send(packet);
            //trimȥ��λ�ո�
            if (data.trim().equals("bye")) {
                break;
            }
        }


        reader.close();
        datagramSocket.close();
    }
}
