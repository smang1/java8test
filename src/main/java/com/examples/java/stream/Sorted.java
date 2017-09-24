package com.examples.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Examples using sorted()
 */
public class Sorted {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,10,3,17,4,9,6,7,81);
        List<String>  l2= Arrays.asList("Banana", "Apple", "Mango", "Butter Fruit", "", "Mango", "Guava", "Orange", "Grape");

        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

        l1.stream().sorted().forEach(System.out::println); //The ‘sorted’ method is used to sort the stream.

        l2.stream().sorted().forEach(System.out::println);

    }
}
