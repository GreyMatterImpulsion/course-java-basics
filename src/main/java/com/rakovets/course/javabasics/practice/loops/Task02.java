package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для табличного процессора:
 * Программа генерирует номера строк при создании таблицы. Известно:
 *
 * @param rows            количество строк в таблице
 * @param headerRowEnable имеет ли таблица строку-заголовок 'true'/'false', если имеет, то для первой строки не нужно
 *                        генерировать номер
 * @author Dmitry Rakovets
 * @version 1.0
 * @return номера строк, где каждый номер на новой строке
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = args.length != 2 ? scanner.nextInt() : Integer.parseInt(args[0]);
        boolean headerRowEnable = args.length != 2 ? scanner.nextBoolean() : Boolean.parseBoolean(args[1]);
        int i;
        if (!headerRowEnable) {
            i = 0;

            while(i < rows - 1) {
                ++i;
                System.out.println(i);
            }
            ++i;
            System.out.print(i);
        } else {
            System.out.println("");
            i = 0;
            while(i < rows - 2) {
                ++i;
                System.out.println(i);
            }
            ++i;
            System.out.print(i);
        }
    }
}