package com.haer.demo03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception {
        //1������һ��Socket
        DatagramSocket datagramSocket = new DatagramSocket();
        //2��������
        String msg = "������Ϣ";
        //���͸�˭
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 8085;
        //���������ݡ�������ʼ���ȡ�ip��ַ���˿ں�
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);
        //3���Ͱ�
        datagramSocket.send(datagramPacket);
        //4���ر�
        datagramSocket.close();
    }
}
