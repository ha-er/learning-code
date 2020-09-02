package com.haer.demo02;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端
public class TcpClientDemo01 {
    public static void main(String[] args) throws Exception {
        //2、需要知道服务器地址，并去连接他、获得端口
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        int prot = 9999;
        //3、创建一个socket连接
        Socket socket = new Socket(serverIP, prot);
        //4、发送消息 IO流
        OutputStream os = socket.getOutputStream();
        os.write("你好，哈儿".getBytes());//写

        os.close();
        socket.close();
    }
}
