package com.haer.collection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest01 {
    public static void main(String[] args) throws Exception {
        //Integer类型
        SortedSet intSet = new TreeSet();

        intSet.add(4);
        intSet.add(3);
        intSet.add(56);
        intSet.add(1);
        intSet.add(99);

        Iterator iterator = intSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//1 3 4 56 99
        }

        //String类型
        SortedSet stringSet = new TreeSet();

        stringSet.add("He");
        stringSet.add("Er");
        stringSet.add("Si");
        stringSet.add("Lei");
        stringSet.add("Miao");

        //给迭代器对象赋值后，之前的值会被覆盖
        iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//Er He Lei Miao Si
        }

        //Date类型
        SortedSet dateSet = new TreeSet();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date t1 = sdf.parse("2020-09-09");
        Date t2 = sdf.parse("2020-04-02");
        Date t3 = sdf.parse("2008-03-02");
        Date t4 = sdf.parse("2020-10-09");
        Date t5 = sdf.parse("2020-09-20");

        dateSet.add(t1);
        dateSet.add(t2);
        dateSet.add(t3);
        dateSet.add(t4);
        dateSet.add(t5);

        iterator = dateSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(sdf.format(iterator.next()));
            //2008-03-02
            //2020-04-02
            //2020-09-09
            //2020-09-20
            //2020-10-09
        }
    }
}
