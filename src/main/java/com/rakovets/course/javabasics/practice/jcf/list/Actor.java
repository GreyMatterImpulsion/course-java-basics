package com.rakovets.course.javabasics.practice.jcf.list;

public class Actor {
    private String firstName;
    private String lastName;
    private int age;
    public int fee;

    public Actor(String firstName, String lastName, int age, int fee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fee = fee;
    }

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getFee() {
        return fee;
    }
}