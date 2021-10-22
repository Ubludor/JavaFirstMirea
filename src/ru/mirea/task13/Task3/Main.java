package ru.mirea.task13.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String google = new String("Google");
        String amazon = new String("Amazon");
        String apple = new String("Apple");
        String microsoft = new String("Microsoft");
        String samsung = new String("Samsung");
        String coca_Cola = new String("Coca-Cola");
        String toyota = new String("Toyota");
        String mercedes_Benz = new String("Mercedes-Benz");

        ArrayList<String> brends = new ArrayList<>(Arrays.asList(google,amazon,apple,coca_Cola,mercedes_Benz,microsoft,samsung,toyota));
        System.out.println("Вывод как есть -"+brends+"\n");
        CollectionArrList CoArLi = new CollectionArrList();
        CoArLi.sort(brends);
        System.out.println("Сортировка по алфавиту -"+brends+"\n");
        CoArLi.reverse(brends);
        System.out.println("Реверс -"+brends+"\n");
        CoArLi.shuffle(brends);
        System.out.println("Рандомная перестновка -"+brends+"\n");

    }
}
