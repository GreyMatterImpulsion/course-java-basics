package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Оружие имеет в себе атрибут святости и какой-то damage. Оружие имеющее атрибут святости наносит в 1.5 раза больше
 * урона по “UNDEAD” и “ZOMBIE”, но наносит в 2 раза меньше урона по “SAINT”. По “ANIMAL”, “HUMANOID”, “PLANT”,
 * “GHOST” без изменений. Определить сколько урона нанесет оружие по данному типу моба.
 *
 * @param damage  - чистый урон оружия (без атрибута)
 * @param typeMob - тип моба
 * @return урон по данному типу моба
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int damage = args.length != 2 ? scanner.nextInt() : Integer.parseInt(args[0]);
        String typeMob = args.length != 2 ? scanner.next() : args[1];
        if (!typeMob.equals("UNDEAD") && !typeMob.equals("ZOMBIE")) {
            if (typeMob.equals("SAINT")) {
                damage = (int)((double)damage * 0.5D);
                System.out.println(damage);
            } else {
                System.out.println(damage);
            }
        } else {
            damage = (int)((double)damage * 1.5D);
            System.out.println(damage);
        }
    }
}
