package ru.mirea.task14.Task2;


import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;


public class Game {

    public static void peremeshat(int[] koloda) {
        //перемешиваем колоду
        int index;
        int temp;
        Random random = new Random();
        for (int i = koloda.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = koloda[index];
            koloda[index] = koloda[i];
            koloda[i] = temp;
        }
    }

    public static void showkoloda(int[] koloda)
    {
        for(int i=0;i<koloda.length;i++)
        {
            System.out.println(koloda[i]);
        }
    }
    public static void razdacha(int [] koloda,Queue<Integer> first,Queue<Integer> second)
    {
        for(int i=0;i<koloda.length;i++)
        {
            if(i%2==0)
            {
                first.add(koloda[i]);
                System.out.print(koloda[i]+" ");
            }
            else
            {
                second.add(koloda[i]);
                 System.out.println(koloda[i]);
            }
        }
    }

    public static void main(String[] args) {

        // Stack<Integer> first = new Stack<Integer>();
        //Stack<Integer> second = new Stack<Integer>();
        //Stack<Integer> bufer = new Stack<Integer>();
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();

        int kolcart = 10;//всего карт
        int[] koloda = new int[kolcart];

        for (int i = 0; i < kolcart; i++) {
            koloda[i] = i;
        }//создаем колоду

        for (int i = 0; i < 1; i++) {
            peremeshat(koloda);
            // showkoloda(koloda);
            razdacha(koloda, first, second);


//сама игра
            int iterator = 0;
            while (iterator < 106) {
                // System.out.println();

                if ((second.stream().count() == 0) || (first.stream().count()==0)) {
                    break;
                } else {
                    if((first.peek()==0)&&(second.peek()==9))
                    {
                        first.add(second.poll());
                    }
                    else if((first.peek()==9)&&(second.peek()==0))
                    {
                        second.add(first.poll());
                    }
                    else if (first.peek() > second.peek()) {
                        first.add(second.poll());
                    } else
                    {
                        second.add(first.poll());
                    }
                }
                iterator++;
            }
            if (iterator >= 106) {
                System.out.println("botva");
            } else if (second.stream().count()==0) {
                System.out.println("first");
            } else {
                System.out.println("second");
            }

        }
    }
}

