package com.haer.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set s = new HashSet();

        s.add(1);
        s.add(1);//不可重复
        s.add(100);
        s.add(88);
        s.add(55);
        s.add(89);

        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            //无序的
            System.out.println(iterator.next());//1 100 55 88 89
        }
    }
}
