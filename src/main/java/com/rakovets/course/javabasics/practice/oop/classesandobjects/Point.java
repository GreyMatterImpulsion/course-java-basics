package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static float distance(Point point1, Point point2) {
        int a;
        float hippo;
        if (point1.x > point2.x) {
            a = point1.x - point2.x;
        } else if (point2.x > point1.x) {
            a = point2.x - point1.x;
        } else a = 0;
        int b;
        if (point1.y > point2.y) {
            b = point1.y - point2.y;
        } else if (point2.y > point1.y) {
            b = point2.y - point1.y;
        } else b = 0;
        hippo = (float) Math.sqrt(a*a + b*b);
        return hippo;
    }

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y = y;
    }
}
