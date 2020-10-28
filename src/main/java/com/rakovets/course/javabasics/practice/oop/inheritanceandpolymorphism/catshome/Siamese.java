package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "*Siam MEW!*";
    }

    public String purr() {
        return "*Siamesish purr*";
    }

    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    public void purr(Person person) {
        person.changeHappiness(20);
    }
}
