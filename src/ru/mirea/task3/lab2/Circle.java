package ru.mirea.task3.lab2;

public class Circle {

    private double radius;
    private String color;

    public Circle()
    {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){

        radius = r;
        color = "red";
    }

    public Circle(double r, String s)
    {
        radius = r;
        color = s;
    }
public double getRadius(){
        return radius;
}
public String getColor(){
        return color;
}
    public double getArea(){
        return radius*radius*Math.PI;
    }

}
