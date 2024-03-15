package Baitap4;

import Baitap4.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red",2);
        System.out.println(circle);
        System.out.println(circle.getArea());
        Rectangle rectangle = new Rectangle("Blue",3,4);
        System.out.println(rectangle);
        System.out.println( rectangle.getArea());
    }
}