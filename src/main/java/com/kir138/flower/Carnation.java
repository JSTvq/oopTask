package com.kir138.flower;

public class Carnation extends Flower {
    //гвоздика

    public Carnation(int price) {
        super(price);
    }

    public Carnation(int quantity, String colour) {
        super(quantity, colour);
    }

    @Override
    public int getPrice() {
        return price + 15;
    }
}
