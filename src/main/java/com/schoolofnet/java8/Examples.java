package com.schoolofnet.java8;

import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String... args) {
        List<String> list = Arrays.asList("Leon", "Claire", "Jill", "Licker");

        for (String str: list) {
            System.out.println(str);
        }

        list.forEach(str -> System.out.println(str));

        List<String> result = list.stream()
                .filter(str -> str.startsWith("L"))
                .toList();
        result.forEach(System.out::print);

        // Java 7
        Person.say("bla bla");

        // Java 8
        result.forEach(Person::say);
    }
}
