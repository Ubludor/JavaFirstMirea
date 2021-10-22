package ru.mirea.task14.Task1;


import java.util.Random;
import java.util.Stack;

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
    public static void razdacha(int [] koloda,Stack<Integer> first,Stack<Integer> second)
    {
        for(int i=0;i<koloda.length;i++)
        {
            if(i%2==0)
            {
                first.push(koloda[i]);
                //System.out.print(koloda[i]+" ");
            }
            else
            {
                second.push(koloda[i]);
               // System.out.println(koloda[i]);
            }
        }
    }

    public static void main(String[] args) {

        Stack<Integer> first = new Stack<Integer>();
        Stack<Integer> second = new Stack<Integer>();
        Stack<Integer> bufer = new Stack<Integer>();

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

                if ((second.empty()) || (first.empty())) {
                    break;
                } else {
                    if((first.peek()==0)&&(second.peek()==9))
                    {
                        while(!first.empty())
                        {
                            bufer.push(first.pop());
                        }
                        first.push(second.pop());
                        while(!bufer.empty())
                        {
                            first.push(bufer.pop());
                        }
                    }
                    else if((first.peek()==9)&&(second.peek()==0))
                    {
                        while(!second.empty())
                        {bufer.push(second.pop());}
                        second.push(first.pop());
                        while (!bufer.empty())
                        {
                            second.push(bufer.pop());
                        }
                    }
                    else if (first.peek() > second.peek()) {
                        while(!first.empty())
                        {
                            bufer.push(first.pop());
                        }
                        first.push(second.pop());
                        while(!bufer.empty())
                        {
                            first.push(bufer.pop());
                        }
                    } else {
                        while(!second.empty())
                        {bufer.push(second.pop());}
                        second.push(first.pop());
                        while (!bufer.empty())
                        {
                            second.push(bufer.pop());
                        }
                    }
                }
                iterator++;
            }
            if (iterator >= 106) {
                System.out.println("botva");
            } else if (second.empty()) {
                System.out.println("first");
            } else {
                System.out.println("second");
            }

        }
    }
}
