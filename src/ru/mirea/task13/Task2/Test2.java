package ru.mirea.task13.Task2;

import java.util.Collections;
import java.util.LinkedList;

public class Test2 {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // Добавление элементов в список
        states.add("Германия");
        states.add("Франция");
        // добавляем элемент в конец
        states.addLast("Великобритания");
        // добавляем элемент в первую позицию
        states.addFirst("Испания");
        // добавляем элемент с индексом 1
        states.add(1, "Италия");


        Collections.sort(states);
        System.out.println(states);

        System.out.println(states);
        System.out.println(Collections.max(states));
        System.out.println(Collections.min(states));
        Collections.reverse(states);
        System.out.println(states);
        Collections.shuffle(states);
        System.out.println("Перемешанный список:"+states);
    }
}

