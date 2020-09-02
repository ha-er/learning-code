package com.haer.demo02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//�����
public class TcpServerDemo02 {
    public static void main(String[] args) throws IOException {
        //1������һ����������ַ
        ServerSocket serverSocket = new ServerSocket(9000);
        //5���ȴ��ͻ�������
        Socket socket = serverSocket.accept();
        //6����ȡ������
        InputStream is = socket.getInputStream();
        //�ļ����
        FileOutputStream fos = new FileOutputStream(new File("logo.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {//�ж�bytes����ֵ
            fos.write(bytes, 0, len);
        }

        //֪ͨ�ͻ����ҽ��������
        OutputStream os = socket.getOutputStream();
        os.write("�ҽ��������".getBytes());

        fos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
