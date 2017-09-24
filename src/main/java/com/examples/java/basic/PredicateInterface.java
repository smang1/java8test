package com.examples.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate <T> interface is a functional interface with a method test(Object) to return a Boolean value.
 * This interface signifies that an object is tested to be true or false.
 */
public class PredicateInterface {

    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println("Print all elements:");
        eval(testList, n -> true);

        System.out.println("Print even numbers:");
        eval(testList, n-> n%2 ==0);

        System.out.println("Print odd numbers:");
        eval(testList,  n-> n%2 !=0);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer i : list) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
