package com.examples.java.stream;

import java.util.Random;

public class Limit {
    public static void main(String[] args) {
        Random r = new Random();
                r.ints(20).limit(2).forEach(System.out:: println); //The ‘limit’ method is used to reduce the size of the stream.
    }
}
