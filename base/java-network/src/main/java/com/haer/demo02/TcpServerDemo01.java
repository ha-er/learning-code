package com.haer.demo02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//�����
public class TcpServerDemo01 {
    public static void main(String[] args) throws IOException {
        //1������һ����������ַ
        ServerSocket serverSocket = new ServerSocket(9999);
        //5���ȴ��ͻ�������
        Socket socket = serverSocket.accept();
        //6����ȡ�ͻ��˵���Ϣ
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//�ܵ���
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {//�ж�bytes����ֵ
            baos.write(bytes, 0, len);
        }
        System.out.println(baos.toString());

        baos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
