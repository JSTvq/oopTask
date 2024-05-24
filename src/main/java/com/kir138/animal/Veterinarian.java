package com.kir138.animal;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("животное ест: " + animal.food);
        System.out.println("животное живет в: " + animal.location);
    }
}
