package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshometest.catshome;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Person person = new Person(0);
    Cat anubis = new Sphynx("anubis");

    @Test
    void catMewTest() {
        Assertions.assertEquals("*Sphynxish MEW!*", anubis.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("*Sphynxish purr*", anubis.purr());
    }

    @Test
    void sphynxMewTest() {
        anubis.mew(person);
        Assertions.assertEquals(-80, person.getHappiness());
    }

    @Test
    void sphynxPurrTest() {
        anubis.purr(person);
        Assertions.assertEquals(10, person.getHappiness());
    }
}
