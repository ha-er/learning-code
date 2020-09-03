package com.haer.demo03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerDemo01 {
    public static void main(String[] args) throws Exception {
        //���Ŷ˿�
        DatagramSocket datagramSocket = new DatagramSocket(8085);
        //�������ݰ�
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
        //�ȴ�����
        datagramSocket.receive(datagramPacket);
        //��ȡһЩ��Ϣ
        System.out.println(datagramPacket.getAddress().getHostAddress());
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        //�ر�����
        datagramSocket.close();
    }
}
