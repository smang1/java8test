package com.examples.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,2,5,6,3,8);
        System.out.println(l.stream().map(i -> i*i).distinct().collect(Collectors.toList()));
    }
}
