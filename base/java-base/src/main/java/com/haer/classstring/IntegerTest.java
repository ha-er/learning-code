package com.haer.classstring;

public class IntegerTest {
    public static void main(String[] args) {

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        //���ﲻ���Զ�����
        System.out.println(i1 == i2);//false
        //�Ƚ������������͵������Ƿ���ȣ�����ʹ��==
        //Integer�Ѿ���д��equales����
        System.out.println(i1.equals(i2));//true

        //��������ڣ�-128~127��֮�䣬java�������ͳ������д������Ͷ���
        //���ݲ����������ģ����ڶ��д�������
        //��ͬ��String��String��������""�������ַ��������ڳ������д�������
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);//false

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//true
    }
}
