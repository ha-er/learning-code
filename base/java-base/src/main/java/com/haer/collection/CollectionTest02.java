package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //添加元素
        c.add(100);//自动装箱
        c.add(3.14);//自动装箱
        c.add(false);//自动装箱

        //1、获取迭代器对象
        //所有的集合依赖的迭代器都实现的Iterator接口
        Iterator iterator = c.iterator();//c.iterator();返回一个对象，而Iterator是一个接口
        //iterator是引用，保存了内存地址，指向堆中的迭代器对象

        //2、遍历，迭代
        //hasNext()：会判断iterator指向的链表下一个元素是否存在，存在返回false
        while (iterator.hasNext()) {
            //会获取当前元素对象，并让iterator指向下一个元素
            Object element = iterator.next();
            System.out.println(element);//100 3.14 false
        }
    }
}
