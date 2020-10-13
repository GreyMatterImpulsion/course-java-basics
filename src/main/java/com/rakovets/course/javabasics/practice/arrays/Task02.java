package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.util.Locale;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        int sumMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
               sumMarks += + marks[i][j];
            }
        }
        double sizeSums = 0;
        int i = 0;
        while (i < marks.length) {
        sizeSums += + marks[i].length;
        i++;
        }
        double averageMarks;
        averageMarks = sumMarks / sizeSums;
        String result = String.format(Locale.ROOT, "%.2f", averageMarks);
        return Double.parseDouble(result);
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        int minMark = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (minMark > marks[i][j]) {
                    minMark = marks[i][j];
                }
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальну отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        int maxMark = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (maxMark < marks[i][j]) {
                    maxMark = marks[i][j];
                }
            }
        }
        return maxMark;
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}