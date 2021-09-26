package ru.mirea.task1;
import java.util.Scanner;

public class Main {

    public static void task1() {
        int schetchik = 0;
        //1 номер
        for (int i = 0; i < 50; i++) {
            schetchik += i;
        }
        System.out.println(schetchik);
        schetchik = 0;
        int i = 49;
        while (i > 0) {
            schetchik += i;
            i--;
        }
        System.out.println(schetchik);
        schetchik = 0;

        i = 49;
        do {
            schetchik += i;
            i--;
        } while (i > 0);
        System.out.println(schetchik);
        schetchik = 0;
    }

    public static void task2()
    {
        for(int i=0;i<10;i++)
        {
            System.out.print(i+" ");
        }
    }

    public static void task3()
    {
        double schetchick=0;
        for(double i=1;i<11;i++)
        {
            schetchick+=1/i;
            System.out.println(schetchick);
        }
    }

    public static void task4()
    {
        double[] arr = new double[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=Math.random()*10;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
        double min = 11;
        int minIndex=0;
        for(int i=0;i<10;i++)
        {
            min =11;
            for(int j=i;j<10;j++)
            {
               if(arr[j]<min)
               {
                   min=arr[j];
                   minIndex=j;
               }
            }
            arr[minIndex]=arr[i];
            arr[i]=min;
        }
        System.out.println("//////////////////////////////////////////");
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int task5(int n)
    {
        int fact=1;
     for(int i=1;i<=n;i++) {
         fact*=i;
     }
     return fact;
    }

    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();
        Scanner in = new Scanner(System.in);
        System.out.println(task5(in.nextInt()));


    }
}
