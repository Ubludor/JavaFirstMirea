package ru.mirea.task9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Main implements ActionListener {


    public Main() {
        initComponents();
    }

    private JFrame viewForm;
    int scoreblue =0;
    int scorered =0;
    private void initComponents() {
        viewForm = new JFrame("Main Form");
        viewForm.setSize(500, 200);
        viewForm.setVisible(true);
        viewForm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        viewForm.setLayout(new BorderLayout());

        JButton button1 = new JButton("+1 point for blue team");
        JButton button2 = new JButton("+1 point for red team");
        button1.setVisible(true);
        button1.setLocation(12, 12);
        button1.setSize(165, 50);
        button2.setVisible(true);
        button2.setLocation(74,12);
        button2.setSize(165, 50);

        JLabel Scoreblue = new JLabel(String.valueOf(scoreblue));
        JLabel Scorered = new JLabel(String.valueOf(scorered));



        viewForm.add(button1,BorderLayout.EAST);
        viewForm.add(button2,BorderLayout.WEST);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());

        viewForm.add(p,BorderLayout.CENTER);

        p.add(Scoreblue,BorderLayout.EAST);
        p.add(Scorered,BorderLayout.WEST);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scorered++;


                Scorered.setText(String.valueOf(scorered));
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreblue++;
                 Scoreblue.setText(String.valueOf(scoreblue));
            }
        });


    }

    public void actionPerformed(ActionEvent action) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}