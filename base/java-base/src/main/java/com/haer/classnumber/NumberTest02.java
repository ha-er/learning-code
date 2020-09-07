package com.haer.classnumber;

import java.math.BigDecimal;

public class NumberTest02 {
    public static void main(String[] args) {
        //������͵����ݾ�ȷ�ȼ��ߣ��ڲ�������ʱ��ʹ�ø���
        //����ʹ��valueֵ��ʼ��
        BigDecimal numValue1 = new BigDecimal(40.00);
        BigDecimal numValue2 = new BigDecimal(20.00);
        BigDecimal numValue3 = new BigDecimal(-100);
        //�������ַ�������ʽ��ʼ��
        BigDecimal numString1 = new BigDecimal("40.00");
        BigDecimal numString2 = new BigDecimal("20.00");
        BigDecimal numString3 = new BigDecimal("-100");

        //�ӷ� 40+20
        BigDecimal resultValue1 = numValue1.add(numValue2);
        BigDecimal resultString1 = numString1.add(numString2);
        //���� 40-20
        BigDecimal resultValue2 = numValue1.subtract(numValue2);
        BigDecimal resultString2 = numString1.subtract(numString2);
        //�˷� 40*20
        BigDecimal resultValue3 = numValue1.multiply(numValue2);
        BigDecimal resultString3 = numString1.multiply(numString2);
        //����ֵ |-100|
        BigDecimal resultValue4 = numValue3.abs();
        BigDecimal resultString4 = numString3.abs();
        //���� 40/20 ������λС�� ����ģʽ
        BigDecimal resultValue5 = numValue1.divide(numValue2, 5, BigDecimal.ROUND_HALF_UP);
        BigDecimal resultString5 = numString1.divide(numString2, 5, BigDecimal.ROUND_HALF_UP);

        System.out.println("�ӷ���value�����" + resultValue1);
        System.out.println("�ӷ���string�����" + resultString1);

        System.out.println("����value�����" + resultValue2);
        System.out.println("������string�����" + resultString2);

        System.out.println("�˷���value�����" + resultValue3);
        System.out.println("�˷���string�����" + resultString3);

        System.out.println("����ֵ��value�����" + resultValue4);
        System.out.println("����ֵ��string�����" + resultString4);

        System.out.println("������value�����" + resultValue5);
        System.out.println("������string�����" + resultString5);

    }


}
