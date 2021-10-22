package ru.mirea.task14.Task5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Game extends JFrame {


    Game(int [] koloda,Queue<Integer> first,Queue<Integer> second)
    {
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel contents = new JPanel();

        JLabel firstLable = new JLabel("Текущая карта у первого -");
        JLabel secondLable = new JLabel("Текущая карта у второго -");
        JLabel firstLableKOL = new JLabel("Всего карт у первого -");
        JLabel secondLableKOL = new JLabel("Всего карт у второго -");
        JButton go = new JButton("GO");
        JLabel last = new JLabel();

        firstLable.setPreferredSize(new Dimension(200,100));
        secondLable.setPreferredSize(new Dimension(200,100));

        firstLableKOL.setPreferredSize(new Dimension(350,200));


        contents.add(firstLable);
        contents.add(go);
        contents.add(secondLable);
        contents.add(firstLableKOL);
        contents.add(secondLableKOL);

        /////////////////////////////////////////////////////////////////////////////////////////
        go.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                //########
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
                    //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

                    firstLableKOL.setText("Количество карт у первого :"+first.size());
                    secondLableKOL.setText("Количество карт у второго :"+second.size());
                    firstLable.setText("Текущая карта у первого :"+(first.size()-1));
                    secondLable.setText("Текущая карта у второго :"+(second.size()-1));
                    iterator++;
                }
                if (iterator >= 106) {
                    last.setText("botva");
                    System.out.println("botva");
                } else if (second.stream().count()==0) {
                    last.setText("Победа первого!");
                    System.out.println("first");

                } else {
                    System.out.println("second");
                    last.setText("Победа второго!");
                }
            }
        });



        ////////////////////////////////////////////////
        contents.add(last);
        //////
        setContentPane(contents);
        // Определение размера окна
        setSize(580, 400);
        // Открытие окна
        setVisible(true);
    }

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

            Game game =new Game(koloda,first,second);
//сама игра


        }
    }
}

