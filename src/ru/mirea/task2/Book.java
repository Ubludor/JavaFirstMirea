package ru.mirea.task2;

public class Book {
    private int numberofpages=0;
    private String name="book";

    public Book(int numberofpages)
    {
        this.numberofpages=numberofpages;
    }
    public Book(int numberofpages, String name)
    {
        this.numberofpages=numberofpages;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;
    }
}
