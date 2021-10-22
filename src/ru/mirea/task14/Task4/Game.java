package ru.mirea.task14.Task4;


import java.lang.reflect.Array;
import java.util.*;


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
    public static void razdacha(int [] koloda,List<Integer>first,List<Integer>second)
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
        //Queue<Integer> first = new LinkedList<>();
        //Queue<Integer> second = new LinkedList<>();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer>second = new ArrayList<>();
        int kolcart = 10;//всего карт
        int[] koloda = new int[kolcart];

        for (int i = 0; i < kolcart; i++) {
            koloda[i] = i;
        }//создаем колоду


            peremeshat(koloda);
            // showkoloda(koloda);
            razdacha(koloda, first, second);
            System.out.println();

//сама игра
            int iterator = 0;
            while (iterator < 106) {
                // System.out.println();

                if ((second.stream().count() == 0) || (first.stream().count()==0)) {
                    break;
                } else {
                    if((first.get(first.size()-1)==0)&&(second.get(second.size()-1)==9))
                    {
                        first.add(0,9);
                        second.remove(second.size()-1);
                        //System.out.println(first.size()+" "+second.size());
                    }
                    else if((first.get(first.size()-1)==9)&&(second.get(second.size()-1)==0))
                    {
                        second.add(0,first.get(first.size()-1));
                        first.remove(first.size()-1);
                        // System.out.println(first.size()+" "+second.size());
                    }
                    else if (first.get(first.size()-1) > second.get(second.size()-1))
                    {
                        first.add(0,second.get(second.size()-1));
                        second.remove(second.size()-1);
                       // System.out.println(first.size()+" "+second.size());



                    } else
                    {
                        second.add(0,first.get(first.size()-1));
                        first.remove(first.size()-1);
                      //  System.out.println(first.size()+" "+second.size());
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

