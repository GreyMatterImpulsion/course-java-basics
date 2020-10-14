package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    Point topLeftPoint;
    Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    int a, b, c, d;
    float getPerimeter(Point topLeftPoint, Point bottomRightPoint) {
        float perimeter = (Math.abs(topLeftPoint.x) + Math.abs(bottomRightPoint.x) + Math.abs(topLeftPoint.y) +Math.abs(bottomRightPoint.y)) * 2;
        return perimeter;
    }

    float getArea(Point topLeftPoint, Point bottomRightPoint) {
        float area = (Math.abs(topLeftPoint.x) + Math.abs(bottomRightPoint.x)) * (Math.abs(topLeftPoint.y) +Math.abs(bottomRightPoint.y));
        return area;
    }

    public void setTopLeftPoint() {
        this.topLeftPoint = topLeftPoint;
    }

    public void setBottomRightPoint() {
        this.bottomRightPoint = bottomRightPoint;
    }
}
