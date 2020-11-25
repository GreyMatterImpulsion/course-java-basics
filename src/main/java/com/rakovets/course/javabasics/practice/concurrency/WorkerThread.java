package com.rakovets.course.javabasics.practice.concurrency;

public class WorkerThread implements Runnable {
    boolean isRun = true;
    private CommonResource commonResource;
    public WorkerThread(CommonResource commonResource){
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        while (isRun) {
            long sleepingTime = 0;
            if (commonResource.deque.peek() != null) {
                sleepingTime = commonResource.deque.pollFirst();
                try {
                    Thread.sleep(sleepingTime * 1000);
                    System.out.println("Ich habe " + sleepingTime + " Sekunden geschlafen");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}