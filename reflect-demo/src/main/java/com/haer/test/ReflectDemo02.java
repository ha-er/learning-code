package com.haer.test;

import com.haer.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        //获取Class对象
        Class personClass = Class.forName("com.haer.domain.Person");

        //获取成员变量
        //Field[] getFields();
        //Field getField(String name)这俩个方法只能获取public修饰的成员变量
        //Field[] getDeclaredFields()
        //Field getDeclaredField(String name)可以获取所有的成员变量
        System.out.println("-------------getFields");
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------getField");
        //这里只能获取成员变量a，因为这里只有a是public修饰的，否则会报java.lang.NoSuchFieldException异常
        Field field = personClass.getField("a");
        Person person1 = new Person();
        //设置成员变量a的值
        field.set(person1, "哈儿");
        //获取成员变量a的值
        Object value = field.get(person1);
        System.out.println(value);
        System.out.println("-------------getDeclaredFields");

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-------------getDeclaredField");
        //这里获取所有成员变量
        Field declaredField = personClass.getDeclaredField("d");
        Person person2 = new Person();
        //暴力反射，可以忽略访问权限修饰符的安全检查，如果没有它，
        // 在设置或者获取非public修饰的成员变量时，会报java.lang.IllegalAccessException异常
        declaredField.setAccessible(true);
        //设置成员变量a的值
        declaredField.set(person2, "Declared哈儿");
        //获取成员变量a的值
        Object value2 = declaredField.get(person2);
        System.out.println(value2);

        //获取构造器（构造方法）
        //Constructor<?>[] getConstructors()
        //Constructor<T> getConstructor(类<?>... parameterTypes)获取public修饰的构造器
        //Constructor<?>[] getConstructors()
        //Constructor<T> getConstructor(类<?>... parameterTypes)获取全部
        System.out.println("-------------getConstructors");
        Constructor[] constructors = personClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-------------getConstructor");
        //传参数类型
        Constructor constructor = personClass.getConstructor(String.class, int.class, String.class, String.class);
        System.out.println(constructor);
        //创建对象
        Object person3 = constructor.newInstance("哈儿", 18, "c值", "d值");
        System.out.println(person3);
        System.out.println("-------------getConstructor获取无参构造");
        //获取无参构造时
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person4 = constructor1.newInstance();
        System.out.println(person4);
        //获取无参构造时可以直接使用Class对象的newInstance()方法,是一样的
        Object person5 = personClass.newInstance();
        System.out.println(person5);
        System.out.println("-------------getDeclaredConstructors");
        Constructor[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("-------------getDeclaredConstructor");
        //可以获取非public修饰的构造器
        Constructor declaredConstructor = personClass.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor);
        //暴力反射
        declaredConstructor.setAccessible(true);
        Object person6 = declaredConstructor.newInstance(200);
        System.out.println(person6);

        // 获取成员方法
        //Method[] getMethods()
        //Method getMethod(String name, 类<?>... parameterTypes)获取public修饰的方法
        //Method[] getDeclaredMethods()
        //Method getDeclaredMethod(String name, 类<?>... parameterTypes)获取全部方法
        System.out.println("-------------getMethods");
        Method[] methods = personClass.getMethods();
        //不仅仅有自己的方法，还有Object类的方法
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-------------getMethods");
        //获取方法，传入方法名和参数
        Method method = personClass.getMethod("eat", String.class);
        System.out.println(method);
        Person person7 = new Person();
        //执行方法
        method.invoke(person7, "饭");
        System.out.println("-------------getDeclaredMethods");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
            //获取方法名的方法
            System.out.println(declaredMethod.getName());
        }
        System.out.println("-------------getDeclaredMethod");
        Method declaredMethod = personClass.getDeclaredMethod("run");
        System.out.println(declaredMethod);
        //暴力反射
        declaredMethod.setAccessible(true);
        //执行方法
        Person person8 = new Person();
        declaredMethod.invoke(person8);
        System.out.println("-------------获取类名（全类名）");
        System.out.println(personClass.getName());
    }
}
