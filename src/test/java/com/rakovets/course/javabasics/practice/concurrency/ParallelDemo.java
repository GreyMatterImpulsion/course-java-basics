package com.rakovets.course.javabasics.practice.concurrency;


import static com.rakovets.course.javabasics.practice.concurrency.Parallel.getArraysAndMaxMembers;
import static com.rakovets.course.javabasics.practice.concurrency.Parallel.randomizer;

public class ParallelDemo {
    public static void main(String[] args) {
        getArraysAndMaxMembers(randomizer());
    }
}
