package com.kir138.flower;

public class Rose extends Flower {
    //роза

    public Rose(int price) {
        super(price);
    }

    public Rose(int quantity, String colour) {
        super(quantity, colour);
    }

    @Override
    public int getPrice() {
        return price + 10;
    }
}
