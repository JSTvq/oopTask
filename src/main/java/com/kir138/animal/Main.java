package com.kir138.animal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] mass = new Animal[3];
        mass[0] = new Cat("сметану", "квартире", "мяу");
        mass[1] = new Dog("кость", "доме", "гав");
        mass[2] = new Horse("сено", "конюшне", "игого");

        Veterinarian vet = new Veterinarian();
        for (Animal a : mass) {
            vet.treatAnimal(a);
            a.makeNoise();
            a.eat();
            a.sleep();
            System.out.println();
        }
    }
}
