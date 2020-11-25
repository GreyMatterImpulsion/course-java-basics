package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterThread implements Runnable {
    public CommonResource commonResource;
    public boolean isRun = true;
    public MasterThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            while (isRun) {
                System.out.println("Und die nachste Nummer ist ");
                int nummer = sc.nextInt();
                if (nummer == -1) {
                    isRun = false;
                    System.out.println("Das Ende");
                } else {
                    commonResource.deque.addLast(nummer);
                }
            }
        } catch (InputMismatchException e) {
            e.getStackTrace();
        }
    }
}