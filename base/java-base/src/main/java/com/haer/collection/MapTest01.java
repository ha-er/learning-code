package com.haer.collection;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        //HashMap��Ĭ�ϳ�ʼ����Ϊ16����������0.75������key�����ظ�
        Map personsMap = new HashMap();
        //Hashtable��Ĭ�ϳ�ʼ����Ϊ11����������0.75
        Hashtable hashtable = new Hashtable();

        //���Ԫ��
        personsMap.put("1000", "HaEr");
        //key��ͬ���Ḳ��֮ǰ��ֵ�������Ǻ�Setһ�������
        personsMap.put("1000", "˼˼");
        personsMap.put("1001", "��");
        personsMap.put("1002", "����");

        System.out.println(personsMap.size());//3;

        //��ȡ���е�value
        Collection values = personsMap.values();

        //����Map
        //��ȡ���е�key
        Set keys = personsMap.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object id = iterator.next();
            //ͨ��key��ȡvalue
            Object name = personsMap.get(id);
            System.out.println(id + ">" + name);
            //1002>����
            //1001>��
            //1000>˼˼
        }

        //��Mapת��ΪSet����
        Set entrySet = personsMap.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            //1002=����
            //1001=��
            //1000=˼˼
        }
    }
}
