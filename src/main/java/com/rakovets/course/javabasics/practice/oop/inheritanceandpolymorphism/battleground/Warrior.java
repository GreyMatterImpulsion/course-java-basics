package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Warrior extends Hero {
    Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("CHARGE!");
    }
}
