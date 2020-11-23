package com.rakovets.course.javabasics.practice.concurrency;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Specification of task 1
 +++Написать программу, бесконечно считывающую целые числа, которые пользователь вводит в Standard Input.
 +++При вводе -1 программа завершает свою работу.
 ---Когда пользователь вводит некоректные данные то бросается InputMismatchException.
 ---Числа, вводимые пользователем, представляют собой количество секунд на которое должен заснуть thread-worker,
 который выводит в Standard Output: I slept ${seconds} seconds.
 ---Все задачи, thread-worker выполняет в том порядке, в котором они были введены пользователем.
 ---Когда у thread-worker нет текущих задач, то он выводит в Standard Output: …​ и засыпает на 1 секунду.
 */
public class MasterWorker {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        while (a != -1) {
            try {
                a = scanner.nextInt();
            } catch (InputMismatchException e) {
                e.printStackTrace();
                a = -1;
                System.out.println("bykvi mimo!");
            }
            System.out.println(a);
        }
    }
}
