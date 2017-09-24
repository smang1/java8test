package com.examples.java.defaultMethod;

public interface Vehicle {
    /**
     * From Java 8 onwards, Interfaces can can have default methods with an implementation
     */
    default void print(){
        System.out.println("I am a vehicle");
    }
    /**
     * From Java 8 onwards, Interfaces can also  have static helper methods with an implementation
     */
    static void blowHorn(){
        System.out.println("Blowing horn!!!");
    }
}
