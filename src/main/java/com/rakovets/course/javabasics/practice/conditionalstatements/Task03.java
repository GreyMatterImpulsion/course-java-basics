package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от количества HP.
 * Меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, в остальных случаях зеленый,
 * если известно:
 *
 * @param healthPointPercentage - количество HP игрока в процентах
 * @return 'RED'/'ORANGE'/'YELLOW'/'GREEN'
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int healthPointPercentage = args.length != 1 ? scanner.nextInt() : Integer.parseInt(args[0]);
        if (healthPointPercentage >= 75 && healthPointPercentage <= 100) {
            System.out.println("GREEN");
        } else if (healthPointPercentage >= 50 && healthPointPercentage < 75) {
            System.out.println("YELLOW");
        } else if (healthPointPercentage >= 25 && healthPointPercentage < 50) {
            System.out.println("ORANGE");
        } else if (healthPointPercentage < 25 && healthPointPercentage >= 0) {
            System.out.println("RED");
        }
    }
}
