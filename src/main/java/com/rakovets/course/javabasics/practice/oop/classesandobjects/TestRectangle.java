package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TestRectangle {
    public static void main(String[] args) {


        Point topLeftPoint = new Point(-1, 1);
        Point bottomRightPoint = new Point( -3, 5);
        Rectangle rectangle = new Rectangle(topLeftPoint,bottomRightPoint);
        System.out.println(rectangle.getArea(topLeftPoint, bottomRightPoint));
        System.out.println(rectangle.getPerimeter(topLeftPoint, bottomRightPoint));
    }
}
