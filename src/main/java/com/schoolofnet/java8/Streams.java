package com.schoolofnet.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {
    public static void showNumbers(List<Integer> numbers) {
        List<Integer> filteredNumbers = numbers
                .stream()
                .filter(number -> number != 0)
                .toList();
        filteredNumbers.forEach(System.out::println);
    }

    public static void showText(List<String> text) {
        List<String> filteredText = text
                .stream()
                .filter(str -> !str.isEmpty())
                .toList();
        filteredText.forEach(System.out::println);
    }

    public static void showTextJoining(List<String> text) {
        String filteredText = text
                .parallelStream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.joining(","));
        System.out.println(filteredText);
    }

    public static void generateHash() {
        Random hash = new Random();
        hash.doubles()
            .limit(2)
            .forEach(System.out::println);

    }

    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(1, 2, 6, 4, 0, 7, 5);
        showNumbers(numbers);

        List<String> text = Arrays.asList("a", "b", "c", "", "", "d", "e");
        showText(text);

        generateHash();

        showTextJoining(text);
    }
}
