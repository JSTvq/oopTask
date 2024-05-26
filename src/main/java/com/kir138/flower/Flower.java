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
    private static int soldCount;
    protected int quantity;
    protected String colour;

    public Flower() {
    }

    public Flower(int price) {
        this.price = price;
    }

    public Flower(int quantity, String colour) {
        this.quantity = quantity;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

}
