package com.examples.java.basic;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    final static Logger logger = Logger.getLogger(MapExample.class);

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ross");
        names.add("Joey");
        names.add("Chandler");
        names.add("Monica");
        names.add("Rachel");
        names.add("Phoebie");

        names.stream().map(name -> name + " is a character from the series \"Friends\"").forEach(System.out::println);

    }
}
