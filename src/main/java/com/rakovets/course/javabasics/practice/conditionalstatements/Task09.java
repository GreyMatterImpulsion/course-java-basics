package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для почты:
 * Определить номер подъезда дома и этаж для данной квартиры, если известно:
 *
 * @param numberFloors             - количество этажей
 * @param numberApartmentsPerFloor - количество квартир на этаже
 * @param apartmentNumber          - номер квартиры
 * @return 'Porch: {0}. Floor: {1}', где {0} - номер подъезда, {1} - номер этажа
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFloors = args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[0]);
        int numberApartmentsPerFloor = args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[1]);
        int apartmentNumber = args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[2]);
        int apsInOnePorch = numberFloors * numberApartmentsPerFloor;
        int porch = apartmentNumber / apsInOnePorch;
        if (apartmentNumber / apsInOnePorch <= 1) {
            porch = 1;
        } else if (apartmentNumber / apsInOnePorch > 1) {
            porch = apartmentNumber / apsInOnePorch + 1;
        }
        int apsLeft;
        if (porch == 1) {
            apsLeft = apartmentNumber;
        } else {
            apsLeft = apartmentNumber - porch * apsInOnePorch;
        }
        int floor = 0;
        if (apsLeft <= numberApartmentsPerFloor && apsLeft > 0) {
            floor = 1;
        } else if (apsLeft % numberApartmentsPerFloor == 0) {
            floor = apsLeft / numberApartmentsPerFloor;
        } else if (apsLeft < 0) {
            if ((apsInOnePorch - apsLeft) % numberApartmentsPerFloor == 0) {
                floor = (apsInOnePorch - apsLeft) / numberApartmentsPerFloor;
            } else if ((apsInOnePorch - apsLeft) % numberApartmentsPerFloor != 0) {
                floor = (apsInOnePorch + apsLeft) / numberApartmentsPerFloor + 1;
            }
        } else {
            floor = apsLeft / numberApartmentsPerFloor + 1;
        }
        System.out.println("Porch: " + porch + ". Floor: " + floor);
    }
}