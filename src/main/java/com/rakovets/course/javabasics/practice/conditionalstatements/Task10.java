package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сети автозаправок:
 * которая выведет на какую заправку необходимо доставить топливо в первую очередь.
 * Известно:
 *
 * @param firstFuelReserves  - запасы топлива на первой заправке
 * @param secondFuelReserves - запасы топлива на второй заправке
 * @param thirdFuelReserves  - запасы топлива на третьей заправке
 * @return номер заправки.
 * Если количество запасов топлива наименьшее на нескольких заправках, то вывести заправки в порядке возрастания
 * Например: '2 3'
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstFuelReserves = args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[0]);
        int secondFuelReserves = args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[1]);
        int thirdFuelReserves = args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[2]);
        if (firstFuelReserves < secondFuelReserves & firstFuelReserves < thirdFuelReserves) {
            System.out.println(1);
        } else if (secondFuelReserves < firstFuelReserves & secondFuelReserves < thirdFuelReserves) {
            System.out.println(2);
        } else if (thirdFuelReserves < firstFuelReserves & thirdFuelReserves < secondFuelReserves) {
            System.out.println(3);
        } else if (firstFuelReserves == secondFuelReserves & secondFuelReserves == thirdFuelReserves) {
            System.out.println("1 2 3");
        } else if (firstFuelReserves == secondFuelReserves) {
            System.out.println("1 2");
        } else if (firstFuelReserves == thirdFuelReserves) {
            System.out.println("1 3");
        } else if (secondFuelReserves == thirdFuelReserves) {
            System.out.println("2 3");
        }
    }
}
