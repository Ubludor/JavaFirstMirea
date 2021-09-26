package ru.mirea.task6;

public class Person implements Nameable {
    private int age = 1;

    public Person()
    {}
    public Person(int age)
    {
        this.age= age;
    }

    public void getName() {
        System.out.println("Person");
    }
}
