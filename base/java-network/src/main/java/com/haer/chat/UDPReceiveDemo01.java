package com.haer.chat;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiveDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);

        while (true) {
            //׼����������
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
            socket.receive(packet);//�ȴ�����

            //�ж϶Ͽ�����
            byte[] data = packet.getData();
            String dataString = new String(data, 0, data.length);

            System.out.println(dataString);

            if (dataString.trim().equals("bye")) {
                break;
            }
        }

        socket.close();


    }
}
