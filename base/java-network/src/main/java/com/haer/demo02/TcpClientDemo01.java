package com.haer.demo02;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ���
public class TcpClientDemo01 {
    public static void main(String[] args) throws Exception {
        //2����Ҫ֪����������ַ����ȥ����������ö˿�
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        int prot = 9999;
        //3������һ��socket����
        Socket socket = new Socket(serverIP, prot);
        //4��������Ϣ IO��
        OutputStream os = socket.getOutputStream();
        os.write("��ã�����".getBytes());//д

        os.close();
        socket.close();
    }
}
