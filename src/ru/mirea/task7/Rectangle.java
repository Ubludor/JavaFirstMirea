package ru.mirea.task7;

public class Rectangle extends Shape{
    protected double widh = 1;
    protected double lenght = 1;
    //конструкторы

    public Rectangle(){}

    public Rectangle(double widh,double lenght) {
        this.widh = widh;
        this.lenght= lenght;
    }
    public Rectangle(double widh,double lenght,String color,boolean filled) {
        super(color,filled);
        this.widh = widh;
        this.lenght= lenght;
    }

    public double getWidh() {
        return widh;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidh(double widh) {
        this.widh = widh;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
