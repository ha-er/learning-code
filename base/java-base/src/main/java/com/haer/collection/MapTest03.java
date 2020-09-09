package com.haer.collection;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        //创建
        SortedMap fruitsMap = new TreeMap();

        fruitsMap.put(new Fruits("西瓜", 2.0), "五斤");
        fruitsMap.put(new Fruits("草莓", 10.0), "四斤");
        fruitsMap.put(new Fruits("桃子", 5.0), "六斤");
        fruitsMap.put(new Fruits("香蕉", 2.5), "十斤");

        //遍历
        Set set = fruitsMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object k = iterator.next();
            Object v = fruitsMap.get(k);
            System.out.println(k + ">>" + v);
        }

    }
}

class Fruits implements Comparable {
    String name;
    double price;

    public Fruits() {
    }

    public Fruits(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Object o) {
        if (this.price > ((Fruits) o).price) {
            return 1;
        } else if (this.price < ((Fruits) o).price) {
            return -1;
        }
        return 0;
    }
}
