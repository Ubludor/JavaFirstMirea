package ru.mirea.task11.n3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menus extends JFrame {
    private static final long serialVersionUID = 1L;

    public Menus(){
        super("Menus");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Font font1 = new Font();

        JPanel contents = new JPanel();

        JButton b_red = new JButton("RED");
        JButton b_blue = new JButton("BLUE");
        JButton b_black = new JButton("BLACK");
        JButton b_1 = new JButton("1");
        JButton b_2 = new JButton("2");
        JButton b_3 = new JButton("3");
        JTextArea TA= new JTextArea();
        TA.setPreferredSize(new Dimension(200,20));


        b_red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TA.setForeground(Color.RED);
            }
        });
        b_black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TA.setForeground(Color.black);
            }
        });
        b_blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TA.setForeground(Color.blue);
            }
        });

        b_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Font font = new Font("Verdana", Font.BOLD, 12);
                TA.setFont(font);
            }
        });
        b_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Verdana", Font.HANGING_BASELINE, 4);
                TA.setFont(font);
            }
        });
        b_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Verdana", Font.PLAIN, 15);
                TA.setFont(font);
            }
        });


        contents.add(b_blue);
        contents.add(b_black);
        contents.add(b_red);
        contents.add(TA);
        contents.add(b_1);
        contents.add(b_2);
        contents.add(b_3);
        // Замена панели содержимого
        setContentPane(contents);

        // Определение размера окна
        setSize(250, 200);
        // Открытие окна
        setVisible(true);



    }

    public static void main(String[] args) {
        new Menus();
    }
}
