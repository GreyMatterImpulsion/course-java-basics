package com.rakovets.course.javabasics.practice.loops;

import java.util.Locale;
import java.util.Scanner;

/**
 * Разработать программу для фитнес браслета:
 * Программа позволяет расчитать пробег, который необходимо совершить спортсмену для подготовки к марафону. Известно:
 *
 * @param startDistance  дистанция которую пробегает спортсмен до начала тренировки
 * @param finishDistance дистанция которую желает пробежать спортсмен после окончания тренировок
 * @param dailyProgress  ежедневный прогресс % по одношению к предыдущему забегу
 * @author Dmitry Rakovets
 * @version 1.0
 * @return пробег (точность 10 метром)
 */
public class Task07 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        int startDistance = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int finishDistance = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        double dailyProgress = (args.length != 3) ? scanner.nextDouble() : Double.parseDouble(args[2]);
        double dailyDistance = (double)startDistance;
        double totalDistance = 0.0D;
        String result;
        if (startDistance == 0) {
            result = String.format(Locale.ROOT, "%.2f", totalDistance);
            System.out.println(result);
        } else {
            while(dailyDistance < (double)finishDistance) {
                totalDistance += dailyDistance;
                dailyDistance += dailyProgress / 100.0D * dailyDistance;
            }
            result = String.format(Locale.ROOT, "%.2f", totalDistance);
            System.out.println(result);
        }
    }
}