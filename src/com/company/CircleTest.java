package com.company;

public class CircleTest {
    public static void main(String[] args) {
        Circle redCircle = new Circle(5.5, "Red");
        Circle whiteCircle = new Circle("White");
        Circle CircleWithoutColor = new Circle(2.75);

        System.out.println(redCircle);
        System.out.println(whiteCircle);
        System.out.println(CircleWithoutColor);
    }
}
