package com.rakovets.course.javabasics.practice.concurrency;

public class MasterWorkerDemo {
    public static void main(String[] args) {
        CommonResource cR = new CommonResource();
        MasterThread mT = new MasterThread(cR);
        Thread masterThread = new Thread(mT);
        masterThread.start();
        WorkerThread wT = new WorkerThread(cR);
        Thread workerThread = new Thread(wT);
        workerThread.setDaemon(true);
        workerThread.start();
    }
}
