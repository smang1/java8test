package com.examples.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("hi", "hello", "", "how", "are", "you", "", "done");
        arr.forEach(System.out::println);

        Random rand = new Random();
        rand.ints(10).forEach(System.out::println);

    }
}
