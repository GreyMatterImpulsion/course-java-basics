package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра. Известно:
 *
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 * <p>
 * Help: Unicode (decimal)
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = args.length != 1 ? scanner.next().charAt(0) : args[0].charAt(0);
        if ((letter < 'A' || letter > 'Z') && (letter < 'a' || letter > 'z')) {
            if (letter >= 1040 && letter <= 1113) {
                System.out.println("cyrillic");
            } else if (letter >= '0' && letter <= '9') {
                System.out.println("digit");
            } else {
                System.out.println("undefined");
            }
        } else {
            System.out.println("latin");
        }
    }
}