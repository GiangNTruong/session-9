package Baitap4;

public class Circle extends Shape {
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public  double getArea() {
        return Math.PI*radius*radius;
    }
}
