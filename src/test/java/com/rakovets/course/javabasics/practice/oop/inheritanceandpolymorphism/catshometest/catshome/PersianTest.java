package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshometest.catshome;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Persian;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Person person = new Person(0);
    Cat persik = new Persian("Jerry");

    @Test
    void catMewTest() {
        Assertions.assertEquals("*PERSIAN MEW!*", persik.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("*Persian purr*", persik.purr());
    }

    @Test
    void persianMewTest() {
        persik.mew(person);
        Assertions.assertEquals(-20, person.getHappiness());
    }

    @Test
    void persianPurrTest() {
        persik.purr(person);
        Assertions.assertEquals(40, person.getHappiness());
    }
}
