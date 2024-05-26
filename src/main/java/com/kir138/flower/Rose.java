package com.kir138.flower;

public class Rose extends Flower {
    //роза

    public Rose(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price + 10;
    }
}
