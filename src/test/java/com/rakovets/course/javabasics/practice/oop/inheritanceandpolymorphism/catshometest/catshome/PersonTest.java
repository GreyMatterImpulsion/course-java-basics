package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshometest.catshome;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private static Person person;

    @BeforeAll
    static void init() {
        person = new Person(0);
    }

    @Test
    void personTest() {
        Assertions.assertEquals(0, person.getHappiness());
        Assertions.assertEquals(20, person.changeHappiness(20));
    }
}
