package com.schoolofnet.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

        // Java 7
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print(String s) {
                System.out.println("Java 7 implementation Functional Interface");
            }
        };
        myInterface.print("Java 7");

        // Java 8
        MyInterface my1 = (String s) -> {
            System.out.println("Java 8 implementation Functional Interface: " + s);
        };
        result.forEach(my1::print);

        my1.body();

        // Optional
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Chris");
        Person person2 = new Person("Jill");
        Person person3 = new Person("Wesker");
        Person person4 = new Person(null);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        Optional<Person> op = Optional.of(person1);
        op.ifPresent(p -> System.out.println("Optional: " + p.getName()));

        people.forEach(p -> System.out.println(p.getName()));
    }
}
