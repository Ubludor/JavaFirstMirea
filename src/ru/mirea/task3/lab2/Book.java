package ru.mirea.task3.lab2;

public class Book {
    private String Autor="Autor";
    private int year=0;
    private String name="book";

    public Book(String name, int year, String Autor)
    {
        this.Autor=Autor;
        this.year=year;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
