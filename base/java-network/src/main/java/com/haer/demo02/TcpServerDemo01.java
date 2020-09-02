package com.haer.demo02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TcpServerDemo01 {
    public static void main(String[] args) throws IOException {
        //1、创建一个服务器地址
        ServerSocket serverSocket = new ServerSocket(9999);
        //5、等待客户端连接
        Socket socket = serverSocket.accept();
        //6、读取客户端的消息
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//管道流
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {//判断bytes中有值
            baos.write(bytes, 0, len);
        }
        System.out.println(baos.toString());

        baos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
