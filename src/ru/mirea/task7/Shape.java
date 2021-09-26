package ru.mirea.task7;

public abstract class Shape {
    protected String color = "white";
    protected boolean filled = false;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    //абстрактные классы
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}