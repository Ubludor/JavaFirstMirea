package ru.mirea.task2;

public class TestAll {
    public static void main(String[] args)
    {
        Circle c1 = new Circle(2.0,"red");
        Ball b1 =new Ball(2);
        Dog d1 = new Dog(2,"Gjycka");
        Book bo1=new Book(203,"Skazki");
        System.out.println(c1.getColor()+"\n"+b1.getVolume()+"\n"+d1.getName()+"\n"+bo1.getName());

    }
}
