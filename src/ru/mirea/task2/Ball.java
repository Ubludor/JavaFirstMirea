package ru.mirea.task2;


public class Ball {
    private int radius=1;
    private int weight=1;
    private String color ="white";

    public Ball(int radius, int weight, String color)
    {
        this.radius=radius;
        this.weight=weight;
        this.color=color;
    }
    public Ball(int radius, int weight)
    {
        this.radius=radius;
        this.weight=weight;

    }
    public Ball(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getVolume()
    {
        return 4/3*this.radius*this.radius*this.radius*Math.PI;
    }
}
