package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.sort;
public class ParallelCalculatorUtil {


    //--------------Task 1
    public static int[] getArraysAndMaxMembers(ArrayList<int[]> list) {
        int[] max = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int [] next = list.get(i);
            sort(next);
            int l = next.length - 1;
            int e = next[l];
            max[i] = e;
        }
        return max;
    }

    public static ArrayList<int[]> randomizer() {
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0; i < (Math.random() * 50); i++) {
            int [] array = new int[(int) (Math.random() * 1000000)];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 300);
            }
            list.add(array);
        }
        return list;
    }

    //-------------Task2, 3

    public static int[] maxValuesWithThreads(List<int[]> list, int threadQuantity) throws InterruptedException {
        int[] result = new int[list.size()];
        AtomicInteger pointer = new AtomicInteger(0);
        List<Thread> threads = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < threadQuantity; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    int localPointer = pointer.getAndIncrement();
                    while (localPointer < list.size()) {
                        int[] next = list.get(localPointer);
                        sort(next);
                        result[localPointer] = next[next.length - 1];
                        localPointer = pointer.getAndIncrement();
                    }
                }
            };
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        long finish = System.currentTimeMillis();
        System.out.println("Processing with " + threadQuantity +" thread(s) took " + (finish - start) + " millis");
        return result;
    }
}