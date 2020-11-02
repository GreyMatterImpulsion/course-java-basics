package com.rakovets.course.javabasics.practice.jcf.list;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudioTest {
    @Test
    void studioTest() {
        ArrayList<Actor> actors = new ArrayList<>() {{
            add(new Actor("Bob", "Robertson", 63, 500));
            add(new Actor("Jack", "Jackson", 45, 450));
            add(new Actor("Carl", "Carlson", 27, 350));
            add(new Actor("Michael", "Michelson", 31, 280));
            add(new Actor("Harley", "Davidson", 53, 270));
        }};
        Studio studio = new Studio(actors);
    }
}
