package com.examples.java.stream;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("hi", "hello", "", "how", "are", "you", "", "done");
        long count = arr.stream().filter(word -> !word.equals("")).count(); //The ‘filter’ method is used to eliminate elements based on a criteria.
        System.out.println(count);
    }
}
