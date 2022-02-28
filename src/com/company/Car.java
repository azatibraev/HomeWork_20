package com.company;

public class Car implements AutoCloseable{

    public Car() {
    }

    public void drive(){
        System.out.println("The car is driving by me");
    }

    @Override
    public void close() throws Exception {
        System.out.println("The car is moving");
    }
}