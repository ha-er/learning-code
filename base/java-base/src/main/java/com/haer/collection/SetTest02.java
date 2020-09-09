package com.haer.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        //��������
        Set s = new HashSet();

        //��Ϊ��Employee��д��hashCode������equals���������ж�e2Ԫ���ڼ����д���
        Employee e1 = new Employee("1", "HaEr");
        //e2Ԫ�ز��ᱻ���
        Employee e2 = new Employee("1", "HaEr");
        //������д��hashCode�����ǱȽ�no���Ե�hashCode����ֵ����ΪString���Ѿ���д��hashCode������
        //hashֵһ����Ȼ������equals�������������ֲ�һ��������e3Ԫ�ػ��e1Ԫ����һ������������
        //ʵ���˰�ͬһ���ŵ�Ա���ŵ�һ�����������ӿ��ѯ�ٶ�
        Employee e3 = new Employee("1", "��");
        Employee e4 = new Employee("3", "����");
        Employee e5 = new Employee("4", "����");

        //��д��hashCode������������һ����
        System.out.println(e1.hashCode());//49
        System.out.println(e2.hashCode());//49

        //���Ԫ��
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        s.add(e5);
        //���ϸ���
        System.out.println(s.size());//4

        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //Employee{no='4003', name='����'}
            //Employee{no='5004', name='����'}
            //Employee{no='1000', name='HaEr'}
            //Employee{no='1000', name='��'}
        }
    }
}

//����Ա�����ű�ŷ�Χ1-10
class Employee {
    //���ű��
    String no;
    //����
    String name;

    public Employee() {
    }

    public Employee(String no, String name) {
        this.no = no;
        this.name = name;
    }

    //��дhashCode����
    @Override
    public int hashCode() {
        return this.no.hashCode();
    }

    //��дequals����
    //ʹԱ����ź�������ͬʱ������ͬһ����
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            if (employee.no.equals(this.no) && employee.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}