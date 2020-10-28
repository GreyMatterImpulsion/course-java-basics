package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshometest.catshome;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CatTest {
    private static Cat cat;

    @BeforeAll
    static void init() {
        cat = new Cat("Jessie");
    }

    @Test
    void mewTest() {
        Assertions.assertEquals("Jessie", cat.getName());
        Assertions.assertEquals("MEOW!", cat.mew());
        Assertions.assertEquals("purrrrrr", cat.purr());
    }
}