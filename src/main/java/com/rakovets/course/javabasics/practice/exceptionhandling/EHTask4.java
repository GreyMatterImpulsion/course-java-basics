package com.rakovets.course.javabasics.practice.exceptionhandling;
public class EHTask4 {

    public static void doShit() throws MySecondException {
        throw new MySecondException("Something went wrong");
    }

    public static void main(String[] args) throws MySecondException {
        try {
            doShit();
        } catch (MySecondException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }
}
