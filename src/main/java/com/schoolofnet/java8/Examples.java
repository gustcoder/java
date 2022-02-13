package com.schoolofnet.java8;

import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String... args) {
        List<String> list = Arrays.asList("Leon", "Claire", "Jill", "Licker");

        for (String str: list) {
            System.out.println(str);
        }
    }
}
