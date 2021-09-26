package ru.mirea.task4;

public class Main {
    public static void main(String[] args)
    {
        Author a1 = new Author("Ivan","Ivan@gmail.com",'m');
        System.out.println(a1.getName()+"\n");
        System.out.println(a1.tooString());
    }
}
