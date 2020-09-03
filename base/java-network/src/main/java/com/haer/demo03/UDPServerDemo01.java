package com.haer.demo03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerDemo01 {
    public static void main(String[] args) throws Exception {
        //开放端口
        DatagramSocket datagramSocket = new DatagramSocket(8085);
        //接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);
        //等待接收
        datagramSocket.receive(datagramPacket);
        //获取一些信息
        System.out.println(datagramPacket.getAddress().getHostAddress());
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        //关闭连接
        datagramSocket.close();
    }
}
