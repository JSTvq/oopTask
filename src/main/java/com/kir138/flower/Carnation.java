package com.kir138.flower;

public class Carnation extends Flower {
    //гвоздика

    public Carnation(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price + 15;
    }
}
