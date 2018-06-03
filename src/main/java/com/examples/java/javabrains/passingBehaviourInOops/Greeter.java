package com.examples.java.javabrains.passingBehaviourInOops;

public class Greeter {
    private void greet(Greeting greeting) {
        greeting.perform();

    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

    }
}
