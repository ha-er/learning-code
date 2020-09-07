package com.haer.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator iterator = c.iterator();
        //c.add(4);//在获取迭代器后直接操作c集合报异常java.util.ConcurrentModificationException

        while (iterator.hasNext()) {
            iterator.next();
            //使用迭代器对象去删除。才能成功删除
            iterator.remove();

            //这里也是使用直接操作c集合报异常java.util.ConcurrentModificationException
            //Object element = iterator.next();
            //c.remove(element);
        }
        System.out.println(c.size());
    }
}
