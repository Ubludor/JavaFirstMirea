package ru.mirea.task23;

import javafx.scene.Scene;
import ru.mirea.task2.Shape;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "2";
        System.out.println(str1.hashCode()+" "+str2.hashCode());

        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        System.out.println(date.hashCode()+" "+calendar.hashCode());


        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
        System.out.println(shape.hashCode()+" "+scanner.hashCode());
    }
}
