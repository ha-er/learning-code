package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        //�������϶���
        Collection c = new ArrayList();

        //���Ԫ��
        c.add(100);//�Զ�װ��
        c.add(3.14);//�Զ�װ��
        c.add(false);//�Զ�װ��

        //1����ȡ����������
        //���еļ��������ĵ�������ʵ�ֵ�Iterator�ӿ�
        Iterator iterator = c.iterator();//c.iterator();����һ�����󣬶�Iterator��һ���ӿ�
        //iterator�����ã��������ڴ��ַ��ָ����еĵ���������

        //2������������
        //hasNext()�����ж�iteratorָ���������һ��Ԫ���Ƿ���ڣ����ڷ���false
        while (iterator.hasNext()) {
            //���ȡ��ǰԪ�ض��󣬲���iteratorָ����һ��Ԫ��
            Object element = iterator.next();
            System.out.println(element);//100 3.14 false
        }
    }
}
