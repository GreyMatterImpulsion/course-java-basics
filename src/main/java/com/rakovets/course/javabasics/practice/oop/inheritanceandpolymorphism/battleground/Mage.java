package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public class Mage extends Hero{
    Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("I see you...");
    }
}
