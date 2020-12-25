package com.rakovets.course.javabasics.practice.reflection;


public class TestClass {
    private String str;
    private int number;

    public TestClass(String str, int number) {
        this.str = str;
        this.number = number;
    }

    public String getStr() {
        return str;
    }

    public int getNumber() {
        return number;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void printStr() {
        System.out.println(str);
    }

    public String makeSomething() {
        return null;
    }

    @Override
    public String toString() {
        return str + number;
    }
}
