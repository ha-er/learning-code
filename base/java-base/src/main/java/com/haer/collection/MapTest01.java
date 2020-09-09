package com.haer.collection;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        //HashMap的默认初始容量为16，加载因子0.75，无序，key不可重复
        Map personsMap = new HashMap();
        //Hashtable的默认初始容量为11，加载因子0.75
        Hashtable hashtable = new Hashtable();

        //添加元素
        personsMap.put("1000", "HaEr");
        //key相同，会覆盖之前的值，而不是和Set一样不添加
        personsMap.put("1000", "思思");
        personsMap.put("1001", "淼淼");
        personsMap.put("1002", "娇娇");

        System.out.println(personsMap.size());//3;

        //获取所有的value
        Collection values = personsMap.values();

        //遍历Map
        //获取所有的key
        Set keys = personsMap.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object id = iterator.next();
            //通过key获取value
            Object name = personsMap.get(id);
            System.out.println(id + ">" + name);
            //1002>娇娇
            //1001>淼淼
            //1000>思思
        }

        //将Map转化为Set集合
        Set entrySet = personsMap.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
            //1002=娇娇
            //1001=淼淼
            //1000=思思
        }
    }
}
