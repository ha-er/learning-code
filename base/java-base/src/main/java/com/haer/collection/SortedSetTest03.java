package com.haer.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest03 {
    public static void main(String[] args) throws Exception {
        //Integer类型
        SortedSet productSet = new TreeSet(new ProductComparator());

        Product p1 = new Product(4.1);
        Product p2 = new Product(1.2);
        Product p3 = new Product(2.5);
        Product p4 = new Product(1.3);

        productSet.add(p1);
        productSet.add(p2);
        productSet.add(p3);
        productSet.add(p4);

        Iterator iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//1 3 4 56 99
        }

    }
}

class Product {
    double price;

    public Product() {
    }

    public Product(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}

//创建一个比较器
class ProductComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        double price1 = ((Product) o1).price;
        double price2 = ((Product) o2).price;
        if (price1 < price2) {
            return -1;
        } else if (price1 > price2) {
            return 1;
        }
        return 0;
    }
}