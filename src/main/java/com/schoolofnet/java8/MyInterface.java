package com.schoolofnet.java8;

@FunctionalInterface
public interface MyInterface {
    void print(String s);

    default void body(){
        System.out.println("My default body interface.");
    }
}
