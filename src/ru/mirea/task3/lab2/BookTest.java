package ru.mirea.task3.lab2;

public class BookTest {
    public static void main(String[]args)
    {
        Book b1=new Book("Skazki",100,"Ivan");
        System.out.println("Название книги - "+b1.getName());
        System.out.println("Имя автора книги - "+b1.getAutor());
        System.out.println("Год выхода книги - "+b1.getYear());
    }
}