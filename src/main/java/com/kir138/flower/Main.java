package com.kir138.flower;

public class Main {
    public static void main(String[] args) {

        //делаем букет
        Tulip tulip1 = new Tulip(100);
        Tulip tulip2 = new Tulip(100);
        Tulip tulip3 = new Tulip(100);
        Rose rose1 = new Rose(110);
        Rose rose2 = new Rose(110);
        Rose rose3 = new Rose(110);
        Carnation carnation1 = new Carnation(120);
        Carnation carnation2 = new Carnation(120);
        Carnation carnation3 = new Carnation(120);

        Flower[] bouquet1 = {tulip1, rose1, rose2, carnation1, carnation2};
        Flower[] bouquet2 = {carnation1, carnation2, carnation3, tulip1, tulip2, tulip3};
        Flower[] bouquet3 = {tulip3, rose3, carnation3, carnation2};
        int price1 = totalFlowers(bouquet1);
        int price2 = totalFlowers(bouquet2);
        int price3 = totalFlowers(bouquet3);
        int amount = Flower.getQt();
        System.out.println("цена букета 1 = " + price1);
        System.out.println("цена букета 2 = " + price2);
        System.out.println("цена букета 3 = " + price3);
        System.out.println("количество проданных цветов = " + amount);
    }

    //цена букета
    public static int totalFlowers(Flower[] bouquet) {
        int totalFlowers = 0;
        for (Flower flower : bouquet) {
            Flower.qt();
            totalFlowers += flower.getPrice();
        }
        return totalFlowers;
    }
}
