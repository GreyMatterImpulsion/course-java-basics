package com.rakovets.course.javabasics.practice.exceptionhandling;

public class EHTask5 {
    /*/-бросить одно из существующих в JDK исключений;
     -отловить это исключение;
   -выбросить своё собственное, указав в качестве причины сообщение отловленного Exception;
   /*/
   public static void main(String[] args) {
       try {
           int h = 2 / 0;
       } catch (ArithmeticException e) {
           throw new MySecondException(e.getMessage());
       }
   }
}