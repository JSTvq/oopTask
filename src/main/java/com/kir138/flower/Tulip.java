package com.kir138.flower;

public class Tulip extends Flower {
    //тюльпан

    public Tulip(int price) {
        super(price);
    }

    public Tulip(int quantity, String colour) {
        super(quantity, colour);
    }

    @Override
    public int getPrice() {
        return price + 5;
    }
}
