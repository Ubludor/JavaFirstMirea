package ru.mirea.task6;

public class Animal implements Nameable {
    private int age = 1;

    public Animal(int age)
    {this.age=age;}

    public Animal()
    {}

    public void getName(){
        System.out.println("Animal");
    }
}
