package com.haer.demo02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//�ͻ���
public class TcpClientDemo02 {
    public static void main(String[] args) throws Exception {
        //1������һ��socket����
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        //2������һ�������
        OutputStream os = socket.getOutputStream();
        //3����ȡ�ļ�
        FileInputStream fis = new FileInputStream(new File("1.png"));
        //4��д���ļ�
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {//�ж�bytes����ֵ
            os.write(bytes, 0, len);
        }

        //ȷ������˽������
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes2 = new byte[1024];
        int len2;
        while ((len2 = fis.read(bytes2)) != -1) {//�ж�bytes����ֵ
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
