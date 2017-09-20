package com.examples.java;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencing {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ross");
        names.add("Joey");
        names.add("Chandler");
        names.add("Monica");
        names.add("Rachel");
        names.add("Phoebie");

        names.forEach(System.out::println); //Method referencing

    }
}
