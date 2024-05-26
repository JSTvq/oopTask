package com.kir138.flower;

public class Main {
    public static void main(String[] args) {
        Tulip tulip = new Tulip(100); //105
        Rose rose = new Rose(110); //120
        Carnation carnation = new Carnation(120); //135

        /*System.out.println(tulip.getPrice() * 3);
        System.out.println(rose.getPrice() * 3);
        System.out.println(carnation.getPrice() * 5);
        int price1 = (tulip.getPrice() * 3) + (rose.getPrice() * 3) + (carnation.getPrice() * 5);
        System.out.println("Букет должен стоить " + price1); //1350*/

        //делаем букет
        Flower[] bouquet = new Flower[3];
        bouquet[0] = new Tulip(3, "желтый");
        bouquet[1] = new Rose(3, "красный");
        bouquet[2] = new Carnation(5, "белый");
        int quantity = totalFlowers(bouquet);
        int price = totalPrice(bouquet);

        System.out.println("в букете " + quantity + " цветов");
        System.out.println("букет стоит " + price);
    }

    //количество цветов
    public static int totalFlowers(Flower[] bouquet) {
        int totalFlowers = 0;
        for (Flower flower : bouquet) {
            totalFlowers += flower.getQuantity();
        }
        return totalFlowers;
    }

    //цена букета
    public static int totalPrice(Flower[] bouquet) {
        int totalPrice = 0;
        for (Flower flower : bouquet) {
            totalPrice += flower.getQuantity() * flower.getPrice();
        }
        return totalPrice;
    }

}
