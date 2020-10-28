package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

public abstract class Hero {

    public String name;

    Hero(String name) {
        this.name = name;
    }

    public void attackEnemy() {
        System.out.println("Attacking");
    }

}
