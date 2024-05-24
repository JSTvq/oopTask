package com.kir138.animal;

public class Horse extends Animal {
    String neighing;

    public Horse(String food, String location, String neighing) {
        super(food, location);
        this.neighing = neighing;
    }

    public void makeNoise() {
        System.out.println("лошадь ржет: " + neighing);
    }

    public void eat () {
        System.out.println("лошадь ест: " + food);
    }
}
