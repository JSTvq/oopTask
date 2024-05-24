package com.kir138.sizeForm;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.1);
        double a = circle.getPerimeter();
        System.out.println(a);

        double b = circle.getArea();
        System.out.println(b);
    }
}