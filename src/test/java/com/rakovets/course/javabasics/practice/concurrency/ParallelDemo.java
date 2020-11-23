package com.rakovets.course.javabasics.practice.concurrency;


import static com.rakovets.course.javabasics.practice.concurrency.ParallelCalculatorUtil.*;

public class ParallelDemo {
    public static void main(String[] args) {
        getArraysAndMaxMembers(randomizer());

        try {
            maxValuesWithThreads(randomizer(), 1);
            maxValuesWithThreads(randomizer(), 2);
            maxValuesWithThreads(randomizer(), 5);
            maxValuesWithThreads(randomizer(), 10);
            maxValuesWithThreads(randomizer(), 30);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}