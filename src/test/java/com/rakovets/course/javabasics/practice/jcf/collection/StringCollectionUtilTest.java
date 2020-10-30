package com.rakovets.course.javabasics.practice.jcf.collection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCollectionUtilTest {
    @Test
    void resetWordsByLengthTest() {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        List<String> gList = new ArrayList<String>();
        gList.add("die farben");
        gList.add("braun");
        gList.add("grun");
        gList.add("rot");
        gList.add("uber");
        gList.add("weiss");
        gList.add("blau");
        gList.add("rosa");
        gList.add("lila");
        gList.add("schwarz");
        assertEquals(Arrays.<String>asList("die farben", "braun", "*", "rot", "*", "weiss", "*", "*", "*", "schwarz"),
                stringCollectionUtil.resetWordsByLength(gList, 4));
    }

    @Test
    void removeWordsByLengthTest() {
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        List<String> gList = new ArrayList<String>();
        gList.add("die farben");
        gList.add("braun");
        gList.add("grun");
        gList.add("rot");
        gList.add("uber");
        gList.add("weiss");
        gList.add("blau");
        gList.add("rosa");
        gList.add("lila");
        gList.add("schwarz");
        assertEquals(Arrays.<String>asList("die farben", "braun", "rot", "weiss", "schwarz"),
                stringCollectionUtil.removeWordsByLength(gList, 4));
    }
}
