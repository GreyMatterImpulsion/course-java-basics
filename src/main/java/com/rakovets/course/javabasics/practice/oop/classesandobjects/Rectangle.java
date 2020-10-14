package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    Point topLeftPoint;
    Point bottomRightPoint;

    Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;
    }

    int a, b, c, d;
    float perimeter;
    float getPerimeter(Point topLeftPoint, Point bottomRightPoint) {
        if (topLeftPoint.x >= 0) {
            a = bottomRightPoint.x - topLeftPoint.x;
            b = 0;
        } else if (topLeftPoint.x < 0 && bottomRightPoint.x > 0) {
            a = Math.abs(topLeftPoint.x);
            b = bottomRightPoint.x;
        } else if (bottomRightPoint.x <= 0) {
            a = Math.abs(topLeftPoint.x - bottomRightPoint.x);
            b = 0;
        }
        if (bottomRightPoint.y >= 0) {
            c = topLeftPoint.y - bottomRightPoint.y;
            d = 0;
        } else if (topLeftPoint.y > 0 && bottomRightPoint.y < 0) {
            c = topLeftPoint.y;
            d = Math.abs(bottomRightPoint.y);
        } else if (topLeftPoint.y < 0) {
            c = Math.abs(bottomRightPoint.y - topLeftPoint.y);
            d = 0;
        }
        return perimeter = (a + b) * 2 + (c + d) * 2;
    }

    int area;
    float getArea(Point topLeftPoint, Point bottomRightPoint) {
        if (topLeftPoint.x >= 0) {
            a = bottomRightPoint.x - topLeftPoint.x;
            b = 0;
        } else if (topLeftPoint.x < 0 && bottomRightPoint.x > 0) {
            a = Math.abs(topLeftPoint.x);
            b = bottomRightPoint.x;
        } else if (bottomRightPoint.x <= 0) {
            a = Math.abs(topLeftPoint.x - bottomRightPoint.x);
            b = 0;
        }
        if (bottomRightPoint.y >= 0) {
            c = topLeftPoint.y - bottomRightPoint.y;
            d = 0;
        } else if (topLeftPoint.y > 0 && bottomRightPoint.y < 0) {
            c = topLeftPoint.y;
            d = Math.abs(bottomRightPoint.y);
        } else if (topLeftPoint.y < 0) {
            c = Math.abs(bottomRightPoint.y - topLeftPoint.y);
            d = 0;
        }
       return area = (a + b) * (c + d);
    }

    public void setTopLeftPoint() {
        this.topLeftPoint = topLeftPoint;
    }

    public void setBottomRightPoint() {
        this.bottomRightPoint = bottomRightPoint;
    }
}
