package com.examples.java.defaultMethod;

public interface FourWheeler {
    /**
     * From Java 8 onwards, Interfaces can can have default methods with an implementation
     */
    default void print(){
        System.out.println("I am a four wheeler");
    }
}
