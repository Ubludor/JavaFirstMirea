package ru.mirea.task5.DOGS;

public abstract class DOGS {
    private int age = 3;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void DOGINFO();
}

class dalmatian extends DOGS
{
    private String color= "white";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void DOGINFO(){System.out.print("Возраст собаки - "+getAge())
    ;}

    public void Dalmatininfo()
    {
        DOGINFO();
        System.out.print("Цвет долматина - "+getColor());
    }

}

class labarador extends DOGS
{
    private String color = "black";

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public void DOGINFO(){System.out.print("Возраст собаки - "+getAge());}

    public void Labaradorinfo()
    {
        DOGINFO();
        System.out.println("Цвет лаборадора - "+ getColor());
    }

}