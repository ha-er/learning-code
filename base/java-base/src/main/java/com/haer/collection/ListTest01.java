package com.haer.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);//���ظ�
        //ͨ���±���ӣ�����haerԪ�طŵ����±�Ϊ1��λ�ã������Ԫ��λ��һλ
        //����ArrayList��ɾЧ�������LinkedList������ṹҪ��һЩ
        list.add(1, "haer");

        //����������
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            //����
            System.out.println(iterator.next());//1 haer 2 3 3
        }

        //List�������еı�����ʽ��ͨ���±����
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
