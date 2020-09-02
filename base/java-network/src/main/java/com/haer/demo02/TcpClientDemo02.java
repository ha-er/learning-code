package com.haer.demo02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception {
        //1、创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        //2、创建一个输出流
        OutputStream os = socket.getOutputStream();
        //3、读取文件
        FileInputStream fis = new FileInputStream(new File("1.png"));
        //4、写出文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {//判断bytes中有值
            os.write(bytes, 0, len);
        }

        //确定服务端接收完毕
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes2 = new byte[1024];
        int len2;
        while ((len2 = fis.read(bytes2)) != -1) {//判断bytes中有值
            baos.write(bytes2, 0, len2);
        }
        System.out.println(baos.toString());

        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
