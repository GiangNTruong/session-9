package Baitap4;

public class Rectangle extends Shape{
    private double chieurong;
    private double chieudai;


    public Rectangle(double chieurong, double chieudai) {
        this.chieurong = chieurong;
        this.chieudai = chieudai;
    }

    public Rectangle(String color, double chieurong, double chieudai) {
        super(color);
        this.chieurong = chieurong;
        this.chieudai = chieudai;
    }

    @Override
    public double getArea() {
        return chieudai*chieurong;
    }


}
