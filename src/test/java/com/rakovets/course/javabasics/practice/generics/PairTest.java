package com.rakovets.course.javabasics.practice.generics;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTest {

    @Test
    void pairUtilsTest() {
        Pair<Integer, String> pair = new Pair<>(12, "Стульев");
        PairUtil<Integer, String> util = new PairUtil<>();
        Pair<String, Integer> swapped = util.swap(pair);
        assertEquals("key=Стульев\tvalue=12", swapped.toString());
    }
}
