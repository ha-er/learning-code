package com.haer.domain;

public class Person {
    public String a;
    protected int b;
    String c;
    private String d;

    public Person() {
    }

    public Person(String a, int b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private Person(int b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Person{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(String a) {
        System.out.println("eat..." + a);
    }

    private void run() {
        System.out.println("run...");
    }
}