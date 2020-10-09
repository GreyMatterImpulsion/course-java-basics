package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Спрогнозировать через какое время party(team) игроков убьет RaidBoss и получит вознаграждение. Известно:
 *
 * @param healthPoints               количество HP RaidBoss
 * @param regenerationPercentPerHour регенерация HP RaidBoss (%/hour)
 * @param averageDamagePerHour       средний урон команды игроков по Raid Boss (HP/hour)
 * @author Dmitry Rakovets
 * @version 1.0
 * @return время для убийства RaidBoss (когда party не справляется за 24 часа, то вывести -1)
 */
public class Task05 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        int healthPoints = (args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[0]));
        double regenerationPercentFromCurrentHealth = (args.length != 3 ? scanner.nextDouble() : Double.parseDouble(args[1]));
        int averageDamagePerHour = (args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[2]));
        int hour = 0;
        double currentHealthPoints = (double)healthPoints;
        while(currentHealthPoints > 0.0D) {
            currentHealthPoints = currentHealthPoints + currentHealthPoints * regenerationPercentFromCurrentHealth / 100.0D - (double)averageDamagePerHour;
            ++hour;
            if (hour > 24) {
                break;
            }
        }
        if (currentHealthPoints > 0.0D) {
            System.out.println("-1");
        } else {
            System.out.println(hour);
        }
    }
}
