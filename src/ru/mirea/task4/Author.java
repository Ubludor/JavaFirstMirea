package ru.mirea.task4;

public class Author {
    private String name="author";
    private String email ="email";
    private char gender ='m';

    public Author(String name, String email, char gender)
    {
        this.email= email;
        this.gender= gender;
        this.name= name;
    }
    public Author(String name, String email)//перегрузка еонструктора в 2
    {
        this.email= email;
        this.name= name;
    }
    public Author(String name) //перегрузка конструктора в 3
    {
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String tooString() {
        String st = "Имя автора - "+getName()+" пол автора - "+getGender()+" эл. почта автора - "+getEmail();
        return st;
    }
}
