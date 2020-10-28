package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Person {
    int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public int changeHappiness(int percentHappiness) {
       return this.happiness += percentHappiness;
    }

    public int getHappiness() {
        return happiness;
    }

    void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}