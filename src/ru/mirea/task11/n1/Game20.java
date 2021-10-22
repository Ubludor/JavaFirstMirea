package ru.mirea.task11.n1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game20 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Game20()
    {


            super("Test ContentPane");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        final int[] popitka = {3};
            double dd = Math.random()*1000;
            System.out.println(dd);
            int num = (int) dd%20+1;

            System.out.println(num);

            JTextField textField = new JTextField();

            Dimension d = new Dimension(20,20);

            textField.setPreferredSize(d);

            JLabel label1 = new JLabel("Игра предлагает пользователю угадать число между 0 и 20 и дает ему три попытки.");
            JLabel label = new JLabel("введите число:");
            JLabel label2 = new JLabel("У вас остсталось попыток: "+ popitka[0]);

            // Создание панели с двумя кнопками
            JPanel contents = new JPanel();

            JButton b = new JButton("ok");

            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if ((popitka[0]>0)&&(textField.getText().equals(Integer.toString(num))))
                    {label2.setText("Вы победили");}
                    else  if((popitka[0]>0)&&(textField.getText()!=Integer.toString(num))){
                    label2.setText("У вас остсталось попыток: "+ popitka[0]--);

                    }
                    else
                    {label2.setText("Вы проиграли");
                    }
                }
            });

            contents.add(label1);
            contents.add(label);
            contents.add(textField);
            contents.add(b);
            contents.add(label2);


            // Замена панели содержимого
            setContentPane(contents);

            // Определение размера окна
            setSize(600, 200);
            // Открытие окна
            setVisible(true);


    }

    public static void main(String args[]) {
        new Game20();
    }
}
