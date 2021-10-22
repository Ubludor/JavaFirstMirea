package ru.mirea.task13.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {

        String amazon = new String("Amazon");
        String apple = new String("Apple");
        String microsoft = new String("Microsoft");
        String google = new String("Google");
        String samsung = new String("Samsung");
        String coca_Cola = new String("Coca-Cola");
        String toyota = new String("Toyota");
        String mercedes_Benz = new String("Mercedes-Benz");

        ArrayList<String> brends = new ArrayList<>(Arrays.asList(amazon,apple,coca_Cola,mercedes_Benz,microsoft,samsung,google,toyota));
        Collections.sort(brends);
        System.out.println(brends);
        System.out.println(Collections.max(brends));
        System.out.println(Collections.min(brends));
        Collections.reverse(brends);
        System.out.println(brends);
        Collections.shuffle(brends);
        System.out.println("Перемешанный список:"+brends);

    }
}
