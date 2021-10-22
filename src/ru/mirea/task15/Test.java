package ru.mirea.task15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Test {

    public static void main(String args[])throws IOException {
        File file = new File("notes3.txt");

        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        Scanner string = new Scanner(System.in);
        String title = string.nextLine();
        writer.write(title);
        writer.flush();
        writer.close();

        File file1 = new File("notes3.txt");

        file1.createNewFile();

        FileWriter w = new FileWriter(file1);

        Scanner stringq = new Scanner(System.in);
        String title1 = string.nextLine();
        w.write(title1);
        w.flush();
        w.close();


        // Создание объекта FileReader
        FileReader fr = new FileReader(file1);
        char [] a = new char[title1.length()];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив
        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        fr.close();

        String str = string.nextLine();

        try {
            Files.write(Paths.get("notes3.txt"), str.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }

    }
}