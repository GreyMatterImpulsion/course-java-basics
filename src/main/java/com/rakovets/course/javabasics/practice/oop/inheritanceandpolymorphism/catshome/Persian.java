package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "*PERSIAN MEW!*";
    }
    @Override
    public String purr() {
        return "*Persian purr*";
    }
    @Override
    public void mew(Person person) {
        person.changeHappiness(-20);
    }
    @Override
    public void purr(Person person) {
        person.changeHappiness(40);
    }
}
