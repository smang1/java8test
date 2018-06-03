package com.examples.java.javabrains.passingBehaviourInOops;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World!");
    }
}
