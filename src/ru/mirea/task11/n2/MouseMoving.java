package ru.mirea.task11.n2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseMoving extends JFrame {


    public MouseMoving() {
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        JPanel contents = new JPanel();
        contents.setLayout(new BorderLayout());


        //южный
        JLabel southlabel = new JLabel();

        southlabel.setPreferredSize(new Dimension(300,100));

        //southlabel.setOpaque( true );
        southlabel.setBackground(Color.red);


        //северный
        JLabel northlabel = new JLabel();
        northlabel.setPreferredSize(new Dimension(300,100));
        //northlabel.setOpaque( true );
        northlabel.setBackground(Color.black);

        JLabel westlabel = new JLabel();
        westlabel.setPreferredSize(new Dimension(100,300));
        //westlabel.setOpaque(true);
        westlabel.setBackground(Color.BLUE);

        JLabel eastlabel = new JLabel();
        eastlabel.setPreferredSize(new Dimension(100,300));
        //eastlabel.setOpaque(true);
        eastlabel.setBackground(Color.GREEN);

        JLabel middlelabel = new JLabel();
        middlelabel.setPreferredSize(new Dimension(300,300));
        //middlelabel.setOpaque(true);
        middlelabel.setBackground(Color.yellow);




        southlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                southlabel.setText("south");
              //  JOptionPane.showMessageDialog(contents,
               //         "south");

            }
        });

        southlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                southlabel.setText("");

            }
        });

        northlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                northlabel.setText("north");
                //JOptionPane.showMessageDialog(contents,
                       // "north");

            }
        });

        northlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                northlabel.setText("");

            }
        });

        eastlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                eastlabel.setText("east");
                //JOptionPane.showMessageDialog(contents,
                        //"east");

            }
        });

        eastlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                eastlabel.setText("");

            }
        });

        westlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                westlabel.setText("west");
                //JOptionPane.showMessageDialog(contents,
                   //     "West");

            }
        });

        westlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                westlabel.setText("");

            }
        });

        middlelabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                middlelabel.setText("center");
                JOptionPane.showMessageDialog(contents,"center");

            }
        });

        middlelabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                middlelabel.setText("");


            }
        });

        contents.add(southlabel,BorderLayout.SOUTH);
        contents.add(westlabel,BorderLayout.WEST);
        contents.add(eastlabel,BorderLayout.EAST);
        contents.add(northlabel,BorderLayout.NORTH);
        contents.add(middlelabel,BorderLayout.CENTER);

        setContentPane(contents);
        // Определение размера окна
        setSize(600, 600);
        // Открытие окна
        setVisible(true);

    }

    public static void main(String[] args) {
        new MouseMoving();
    }
}

