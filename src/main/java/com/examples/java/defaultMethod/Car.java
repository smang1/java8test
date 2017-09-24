package com.examples.java.defaultMethod;

class Car implements Vehicle, FourWheeler{

    public void print(){
        Vehicle.super.print();
        Vehicle.blowHorn();
        FourWheeler.super.print();

        System.out.println("I am a car");

    }

}
