package com.kir138.animal;

public class Dog extends Animal {
    String barking;

    public Dog(String food, String location, String barking) {
        super(food, location);
        this.barking = barking;
    }

    public void makeNoise() {
        System.out.println("собака лает: " + barking);
    }

    public void eat () {
        System.out.println("собака ест: " + food);
    }
}
