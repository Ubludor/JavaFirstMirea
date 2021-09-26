package ru.mirea.task7;

public  class Circle extends Shape{

    protected double radius =1;

    public Circle(){}


    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //наследующие методы
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
