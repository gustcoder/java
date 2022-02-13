package com.schoolofnet.java8;

public class Person {
    private String name;

    public Person(String name) {
        // construct
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void say(String str) {
        System.out.println("A person is saying something: " + str);
    }
}
