package com.haer.collection;

import java.text.SimpleDateFormat;
import java.util.*;

public class SortedSetTest02 {
    public static void main(String[] args) throws Exception {
        //Integer����
        SortedSet userSet = new TreeSet();

        User user1 = new User(12);
        User user2 = new User(11);
        User user3 = new User(15);
        User user4 = new User(20);

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);

        Iterator iterator = userSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//1 3 4 56 99
        }

    }
}

//����ʵ��Comparable�ӿڣ�����ᱨ�쳣
// java.lang.ClassCastException: com.haer.collection.User cannot be cast to java.lang.Comparable
class User implements Comparable {
    int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }

    //ʵ�ֽӿڵķ���
    //����ʵ�����������ʹUser����age�Ĵ�С����
    public int compareTo(Object o) {
        int age1 = this.age;
        int age2 = ((User) o).age;
        return age1 - age2;//������
        //return age2-age1;//������
    }
}
