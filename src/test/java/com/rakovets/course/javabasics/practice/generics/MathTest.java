package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    Math<Integer> mathTestInteger = new Math<>();
    Math<Double> mathTestDouble = new Math<>();

    @Test
    void getMaxParamTest() {
        Assertions.assertEquals(5, mathTestInteger.getMaxParam(1,5, 4));
        Assertions.assertEquals(1, mathTestInteger.getMaxParam(1,1, 1));
        Assertions.assertEquals(17, mathTestInteger.getMaxParam(12,13, 17));
        Assertions.assertEquals(12, mathTestInteger.getMaxParam(12,12, 4));

        Assertions.assertEquals(5.4, mathTestDouble.getMaxParam(1.5,5.4, 0.4));
        Assertions.assertEquals(15.6, mathTestDouble.getMaxParam(0.1,15.6, 4.4));
        Assertions.assertEquals(5.5, mathTestDouble.getMaxParam(5.5,5.5, 4.2));
        Assertions.assertEquals(1.0, mathTestDouble.getMaxParam(1.0,1.0, 1.0));
    }

    @Test
    void getMinOf5Params() {
        Assertions.assertEquals(1, mathTestInteger.getMinOf5Params(1,2,3,4,5));
        Assertions.assertEquals(1.2, mathTestDouble.getMinOf5Params(1.5,1.2,3.0,5.8,5.9));
        Assertions.assertEquals(0.0, mathTestDouble.getMinOf5Params(0.0,1.2,3.0,5.8,5.9));
    }
}
