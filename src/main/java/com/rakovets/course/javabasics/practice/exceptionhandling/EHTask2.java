package com.rakovets.course.javabasics.practice.exceptionhandling;

public class EHTask2 {
    public static void main(String[] args) {
        try {
            int[] array = new int[3];
            array[4] = 5;
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nein");
        }
    }
}