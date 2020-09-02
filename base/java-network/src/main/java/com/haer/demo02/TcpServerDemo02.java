package com.haer.demo02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class TcpServerDemo02 {
    public static void main(String[] args) throws IOException {
        //1、创建一个服务器地址
        ServerSocket serverSocket = new ServerSocket(9000);
        //5、等待客户端连接
        Socket socket = serverSocket.accept();
        //6、获取输入流
        InputStream is = socket.getInputStream();
        //文件输出
        FileOutputStream fos = new FileOutputStream(new File("logo.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {//判断bytes中有值
            fos.write(bytes, 0, len);
        }

        //通知客户端我接收完毕了
        OutputStream os = socket.getOutputStream();
        os.write("我接收完毕了".getBytes());

        fos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
