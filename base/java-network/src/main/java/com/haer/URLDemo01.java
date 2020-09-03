package com.haer;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo01 {
    public static void main(String[] args) throws Exception {
        //1.下载地址
        URL url = new URL("http://local:8080/helloworld/index.html?id=1&name=haer");
        System.out.println(url.getProtocol());//协议
        System.out.println(url.getHost());//主机ip
        System.out.println(url.getPort());//端口
        System.out.println(url.getPath());//文件
        System.out.println(url.getFile());//全路径
        System.out.println(url.getQuery());//参数

        //测试下载网易云《隔岸》
        URL url2 = new URL("https://m10.music.126.net/20200903195415/ff9e429c9b9992ca65f0601eaec28751/yyaac/obj/wonDkMOGw6XDiTHCmMOi/2920524010/af6b/94d5/2bd7/9e5bb66828e846af99717d2976ef1e88.m4a");
        //2、连接到这个资源 HTTP
        HttpURLConnection urlConnection = (HttpURLConnection) url2.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream fos = new FileOutputStream("隔岸.m4a");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        inputStream.close();
        urlConnection.disconnect();

    }
}
