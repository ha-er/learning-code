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
        list.add(3);//可重复
        //通过下标添加，发现haer元素放到了下标为1的位置，后面的元素位移一位
        //所以ArrayList增删效率相比于LinkedList的链表结构要慢一些
        list.add(1, "haer");

        //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            //有序
            System.out.println(iterator.next());//1 haer 2 3 3
        }

        //List集合特有的遍历方式，通过下标遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
