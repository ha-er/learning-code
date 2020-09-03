package com.haer.demo03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception {
        //1、建立一个Socket
        DatagramSocket datagramSocket = new DatagramSocket();
        //2、建立包
        String msg = "发送信息";
        //发送给谁
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 8085;
        //参数：数据、数据起始长度、ip地址、端口号
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);
        //3发送包
        datagramSocket.send(datagramPacket);
        //4、关闭
        datagramSocket.close();
    }
}
