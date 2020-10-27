package com.rakovets.course.javabasics.practice.generics;

public class Math <T extends Number & Comparable> {

//-------------------------Task 1
    public T getMaxParam(T a, T b, T c) {
        if (a.intValue() == b.intValue() && a.intValue() == c.intValue()) {
            return a;
        } else if (b.intValue() >= a.intValue() && b.intValue() > c.intValue()) {
            return b;
        } else if (c.intValue() >= a.intValue() && c.intValue() > b.intValue()) {
            return c;
        } else if (a.intValue() >= b.intValue() && a.intValue() > c.intValue()) {
            return a;
        }
        return null;

//-------------------------Task 2
    }
    public T getMinOf5Params(T a, T b, T c, T d, T e) {
        T preResult1 = null;
        T preResult2 = null;
        if (a.intValue() == b.intValue() && a.intValue() == c.intValue()) {
             preResult1 = a;
        } else if (b.intValue() <= a.intValue() && b.intValue() < c.intValue()) {
            preResult1 = b;
        } else if (c.intValue() <= a.intValue() && c.intValue() < b.intValue()) {
            preResult1 = c;
        } else if (a.intValue() <= b.intValue() && a.intValue() < c.intValue()) {
            preResult1 = a;
        }
        if (d.intValue() <= e.intValue()) {
            preResult2 = d;
        } else if (e.intValue() <= d.intValue()) {
            preResult2 = e;
        }
        if (preResult1.intValue() < preResult2.intValue()) {
            return preResult1;
        } else {
            return preResult2;
        }
    }

//-------------------------Task 3
    public double getAverage(T array[]) {
        double result = 0.0;
        for(int i = 0; i < array.length; i++ ) {
            result += array[i].doubleValue() / array.length;;
        }
        return result;
    }

}
