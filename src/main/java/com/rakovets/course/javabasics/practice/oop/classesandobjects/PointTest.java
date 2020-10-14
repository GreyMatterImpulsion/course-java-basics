package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(2,5);
        Point point2 = new Point (5,7);

        System.out.println(Point.distance(point1, point2));

    }


}
