package com.haer.classnumber;

import java.text.DecimalFormat;

public class NumberTest01 {
    public static void main(String[] args) {

        //�������ָ�ʽ������
        //����ǧ��λ����λ��һ�����ţ�
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        //��ʼ��ʽ��
        System.out.println(decimalFormat.format(2000000000.16));//2,000,000,000

        //����ǧ��λ��������һλС��
        DecimalFormat decimalFormat2 = new DecimalFormat("###,###.#");
        System.out.println(decimalFormat2.format(2000000000.16));//2,000,000,000

        //����ǧ��λ��������2λС��,��������
        DecimalFormat decimalFormat3 = new DecimalFormat("###,###.00");
        System.out.println(decimalFormat3.format(2000000000.1));//2,000,000,000
    }
}
