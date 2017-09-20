package com.examples.java;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class SortExample {
    final static Logger logger = Logger.getLogger(SortExample.class);
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ross");
        names.add("Joey");
        names.add("Chandler");
        names.add("Monica");
        names.add("Rachel");
        names.add("Phebie");

        logger.info(String.format("Input list: %s",names));

        names.sort((s1,s2) -> s1.compareTo(s2));

        logger.info(String.format("Sorted list: %s",names));

    }
}
