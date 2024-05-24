package com.kir138.animal;

public class Cat extends Animal {
    String meow;

    public Cat(String food, String location, String meow) {
        super(food, location);
        this.meow = meow;
    }

    public void makeNoise() {
        System.out.println("кошка мяукает: " + meow);
    }

    public void eat () {
        System.out.println("кошка ест: " + food);
    }
}
