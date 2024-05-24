package com.kir138.animal;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("животное издает звук");
    }

    public void eat() {
        System.out.println("животное ест " + food);
    }

    public void sleep() {
        System.out.println("животное спит в " + location);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
