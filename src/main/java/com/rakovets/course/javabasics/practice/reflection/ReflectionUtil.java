package com.rakovets.course.javabasics.practice.reflection;

import java.lang.reflect.Field;

public class ReflectionUtil {
    public static Field getField(Class<?> clazz, String fieldName) {
        Field result = null;
        try {
            result = clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return result;
    }


}
