package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest05 {
    public static void main(String[] args) {
        //�������϶���
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator iterator = c.iterator();
        //c.add(4);//�ڻ�ȡ��������ֱ�Ӳ���c���ϱ��쳣java.util.ConcurrentModificationException

        while (iterator.hasNext()) {
            iterator.next();
            //ʹ�õ���������ȥɾ�������ܳɹ�ɾ��
            iterator.remove();

            //����Ҳ��ʹ��ֱ�Ӳ���c���ϱ��쳣java.util.ConcurrentModificationException
            //Object element = iterator.next();
            //c.remove(element);
        }
        System.out.println(c.size());
    }
}
