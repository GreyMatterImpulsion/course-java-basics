package com.rakovets.course.javabasics.practice.generics;

import java.util.Arrays;

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


//-------------------------Task 4
    public T getMaxOfArray(T array[]) {
        T result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (result.compareTo(array[i]) < 0) {
                result = array[i];
            }
        }
        return result;
    }

//-------------------------Task 5
    public T getMinOfArray(T array[]) {
        T result = array[0];
         for (int i = 0; i < array.length; i++) {
            if (result.compareTo(array[i]) > 0) {
                result = array[i];
            }
        }
    return result;
    }

//-------------------------Task 6

    public T[] getArraySorted(T[] array) {
        Arrays.sort(array);
        return array;
    }

//-------------------------Task 7

    public T doBinarySearch(T []array, T wanted) {
        T[] sortedArray = getArraySorted(array);
        int start = 0;
        int end = sortedArray.length;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (sortedArray[middle].equals(wanted)) {
                return sortedArray[middle];
            } else if (sortedArray[middle].compareTo(wanted) > 0) {
                end = middle;
            } else {
                start = middle;
            }
        }
        return null;
    }
}