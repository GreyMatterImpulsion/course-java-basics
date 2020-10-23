package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Archer extends Hero{
    Archer(String name) {
        super(name);
    }
    @Override
    public void attackEnemy() {
        System.out.println("Bull's eye!");
    }
}
