package com.haer.string;

public class StringTest03 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();//Ĭ��16

        //��ΪStringBuffer�ǿɱ�ģ�Ƶ��ƴ�Ӳ����´����ַ�������
        //������ҪƵ��ƴ�ӵ�ʱ��ʹ��StringBuffer
        for (int i = 0; i < 10; i++) {
            stringBuffer.append("����" + i);
        }
        System.out.println(stringBuffer);
    }
}
