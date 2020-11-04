package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.Random;

public class EHTask3 {
    final static Random random = new Random();

    public static void main(String[] args) throws MyException {
        try {
            for (int j = 0; j <= 10; j++) {
                if (random.nextInt() % 2 == 0) {
                    System.out.println("tick-tok");
                } else {
                    throw new MyException();
                }
            }
        } catch (MyException e) {
            System.out.println(e.getStackTrace());
        }
    }
}