package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "MEOW!";
    }

    public String purr() {
        return "purrrrrr";
    }

    public void mew(Person person) {
        person.changeHappiness(-20);
    }

    public void purr(Person person) {
        person.changeHappiness(20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}