package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для табличного процессора:
 * Программа генерирует номера строк при создании таблицы. Известно:
 *
 * @param rows количество строк в таблице
 * @author Dmitry Rakovets
 * @version 1.0
 * @return номера строк, где каждый номер на новой строке
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = args.length != 1 ? scanner.nextInt() : Integer.parseInt(args[0]);
        int i = 0;
        while(i < rows - 1) {
            ++i;
            System.out.println(i);
        }
        ++i;
        System.out.print(i);
    }
}