package com.rakovets.course.javabasics.practice.exceptionhandling;

public class EHTask1 {
    public static void main(String[] args) {
        String h = null;
        try {
            h.concat("13");
        } catch (Exception e) {
            System.out.println("4t0-t0 ne tak");
        }
    }
}