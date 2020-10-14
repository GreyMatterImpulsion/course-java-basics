package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {

    public static void main(String[] args) {
        Time breakfast = new Time(9,30,10);
        Time lunch = new Time(13, 30,40);
        System.out.println("It is " + breakfast.getHours() + ":" + breakfast.getMinutes() + ":" + breakfast.getSeconds() + ". It's epic meal time!");
        System.out.println("It is " + lunch.getHours() + ":" + lunch.getMinutes() + ":" + lunch.getSeconds() + ". Eat shit.");

        System.out.println(lunch.getTotalSeconds(lunch.getHours(), lunch.getMinutes(), lunch.getSeconds()));
    }
}
