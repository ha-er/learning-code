package com.haer.classstring;

public class StringTest01 {
    public static void main(String[] args) {
        //����һ��"haer"�ַ������󣬸ö�����ڴ��ַ���ñ���s1����
        //siֻ��һ�����ã�ָ��"haer"����
        String s1 = "haer";
        //si��û��ʹ��final���Σ����Կ�����s1����ָ��"sb"�ַ���
        //����"haer","sb"�ַ��������ǲ����Ըı��
        s1 = "sb";
        System.out.println(s1);//sb

        String s2 = "����";//��һ�δ��������ڳ��������½�һ��"����"�ַ�������,�ö��󲻿ɱ�
        String s3 = "����";//�ڶ��Σ��ͻ�ֱ�Ӵ��ַ���������������
        System.out.println(s2 == s3);//true��s2��ָ���Ǻ�s3һ�µ�

        //ʹ��String�Ĺ��췽��������������
        String s4 = new String("����");
        String s5 = new String("����");
        System.out.println(s4 == s5);//false
        //���ԱȽ������ַ����Ƿ���ȣ�����ʹ��String��equals����
        System.out.println(s4.equals(s5));//true
        //����Object���equals�����Ǻ�==һ���ģ�����String��д��equals����
        //�����ǱȽ������ַ����Ƿ�һ��

        //һ�³���ִ�н����󣬻����ַ��������ش��������ַ�������
        String s6 = "��";
        String s7 = "����";
        String s8 = s6 + s7;
    }
}
