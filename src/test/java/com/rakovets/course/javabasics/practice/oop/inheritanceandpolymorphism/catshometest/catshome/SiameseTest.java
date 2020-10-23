package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshometest.catshome;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Person person = new Person(0);
    Cat mao = new Siamese("Mao");

    @Test
    void catMewTest() {
        Assertions.assertEquals("*Siam MEW!*", mao.mew());
    }

    @Test
    void catPurrTest() {
        Assertions.assertEquals("*Siamesish purr*", mao.purr());
    }

    @Test
    void SiameseMewTest() {
        mao.mew(person);
        Assertions.assertEquals(-10, person.getHappiness());
    }

    @Test
    void SiamesePurrTest() {
        mao.purr(person);
        Assertions.assertEquals(20, person.getHappiness());
    }
}
