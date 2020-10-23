package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "*Sphynxish MEW!*";
    }

    public String purr() {
        return "*Sphynxish purr*";
    }

    public void mew(Person person) {
        person.changeHappiness(-80);
    }

    public void purr(Person person) {
        person.changeHappiness(10);
    }
}
