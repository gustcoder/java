package com.schoolofnet.java8;

public class Main {
    public static void main(String... args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Java 8 - School of Net");
            }
        };

        new Thread(run).start();

        // using Lambda
        Runnable runWithLambda = () -> System.out.println("Java 8 With Lambda");
        new Thread(runWithLambda).start();
    }
}
