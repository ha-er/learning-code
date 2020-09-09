package com.haer.collection;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        //����
        SortedMap fruitsMap = new TreeMap();

        fruitsMap.put(new Fruits("����", 2.0), "���");
        fruitsMap.put(new Fruits("��ݮ", 10.0), "�Ľ�");
        fruitsMap.put(new Fruits("����", 5.0), "����");
        fruitsMap.put(new Fruits("�㽶", 2.5), "ʮ��");

        //����
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
