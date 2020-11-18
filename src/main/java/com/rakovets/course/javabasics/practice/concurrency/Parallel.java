package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;

public class Parallel {
    public static int[] getArraysAndMaxMembers(ArrayList<int[]> list) {
        int[] maxValues = new int [5];
        for(int i = 0; i < 5; i++) {
            int maxValue = list.get(i)[0];
            for(int k = 1; k < list.get(i).length; k++) {
                if (list.get(i)[k] > maxValue) {
                    maxValue = list.get(i)[k];
                }
            }
            maxValues[i] = maxValue;
            System.out.println(maxValue);
        }
        return maxValues;
    }

    public static ArrayList<int[]> randomizer() {
        ArrayList<int[]> list = new ArrayList<int[]>(); // А старый говорил поменять, попомни его слова и в след раз не перчи
        for(int i = 0; i < 5; i++) {
            int [] array = new int[(int) (Math.random() * 1000000)];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 300);
            }
            list.add(array);
        }
        return list;
    }
}
