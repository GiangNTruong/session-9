package Baitap1;

import Baitap2.Colorable;

public class Square extends Rectangle  implements Resizable  {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }


    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }
    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        // Tăng kích thước của hình vuông theo tỷ lệ percent
        double newSide = getSide() * (1 + percent / 100);
        setSide(newSide);
    }

//    @Override
//    public void howToColor() {
//        System.out.println("Color all four sides..");
//    }
}
