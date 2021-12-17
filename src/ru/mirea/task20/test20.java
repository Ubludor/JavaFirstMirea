package ru.mirea.task20;
import java.util.*;


public class test20 {
    public static void task1()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Введите год, месяц, число, часы, минуты : ");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int h = sc.nextInt();
        int mi = sc.nextInt();
        Calendar calendar = new GregorianCalendar(y,m,d,h,mi);
        Date date = calendar.getTime();
        System.out.println(date);

    }
    public static void task2()
    {
        Scanner sc  = new Scanner(System.in);
        String name;
        System.out.println("Введите имя :");
        name = sc.nextLine();
        System.out.println(name);

        Date vidachca = new Date();
        System.out.println("Дата выдвчи : "+vidachca);
        System.out.println("Введите дату окончания работы (год, месяц, число, часы, минуты) : ");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int h = sc.nextInt();
        int mi = sc.nextInt();
        Calendar calendar = new GregorianCalendar(y,m,d,h,mi);
        Date end_date = calendar.getTime();
        System.out.println("Осталось времени : "  );

        // Количество дней между датами в миллисекундах
        long difference =end_date.getTime() -  vidachca.getTime() ;
        // Перевод количества дней между датами из миллисекунд в дни
        int days =  (int)((difference / (24 * 60 * 60 * 1000))-31); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        // Вывод разницы между датами в днях на экран
        System.out.println(days + " дн.");

    }
    public static void main(String[] args) {
        //task1();
        task2();
    }
}
