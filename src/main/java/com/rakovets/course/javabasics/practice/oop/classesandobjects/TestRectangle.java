package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TestRectangle {
    public static void main(String[] args) {


        Point topLeftPoint = new Point(3, 7);
        Point bottomRightPoint = new Point( 7, 3);
        Rectangle rectangle = new Rectangle(topLeftPoint,bottomRightPoint);
        System.out.println(rectangle.getArea(topLeftPoint, bottomRightPoint));
        System.out.println(rectangle.getPerimeter(topLeftPoint, bottomRightPoint));
    }
}
