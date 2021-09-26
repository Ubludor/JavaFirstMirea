package ru.mirea.task2;

public class Dog {
    private int age=1;
    private String name="DOG";

    public Dog(int age)
    {
        this.age=age;
    }
    public Dog(String name)
    {
        this.name=name;
    }

    public Dog(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
