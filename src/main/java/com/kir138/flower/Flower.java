package com.kir138.flower;

public class Flower {
    /**
     * Необходимо реализовать иерархию цветов (розы, гвоздики, тюльпаны). Создать несколько объектов-цветов.
     * Собрать 3 букета (используем массивы) с определением их стоимости. В букет может входить несколько
     * цветов одного типа. Суперкласс "Flower" должен содержать метод определяющий стоимость цветка, этот
     * метод переопределить в классах наследниках. Также подсчитать количество проданных цветов
     * (используем статический метод).
     */

    protected int price;
    private static int quantity = 0;

    public Flower() {
    }

    public Flower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void qt() {
        quantity++;
    }

    public static int getQt() {
        return quantity;
    }
}
