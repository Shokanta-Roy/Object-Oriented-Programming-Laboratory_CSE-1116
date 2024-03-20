package SHOKANTA_S_CALCULATOR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    JFrame jFrame = new JFrame();
    JLabel name = new JLabel("Shokanta's Calculator");
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
    JTextField input_1 = new JTextField();
    JTextField input_2 = new JTextField();
    JLabel result = new JLabel();


    public Calculator() {
        jFrame.setLocation(50, 50);
        jFrame.setSize(565, 700);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        name.setBounds(105, 30, 350, 50);
        input_1.setBounds(50, 120, 200, 50);
        input_2.setBounds(300, 120, 200, 50);
        add.setBounds(125, 250, 50, 50);
        sub.setBounds(375, 250, 50, 50);
        mul.setBounds(125, 400, 50, 50);
        div.setBounds(375, 400, 50, 50);
        result.setBounds(125, 550, 300, 50);

        jFrame.add(name);
        jFrame.add(input_1);
        jFrame.add(input_2);
        jFrame.add(add);
        jFrame.add(sub);
        jFrame.add(mul);
        jFrame.add(div);
        jFrame.add(result);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1 = Double.parseDouble(input_1.getText());
                double no2 = Double.parseDouble(input_2.getText());
                result.setText("Addition: " + (no1+ no2));
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1 = Double.parseDouble(input_1.getText());
                double no2 = Double.parseDouble(input_2.getText());
                result.setText("Subtraction: " + (no1- no2));
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1 = Double.parseDouble(input_1.getText());
                double no2 = Double.parseDouble(input_2.getText());
                result.setText("Multiplication: " + (no1* no2));
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double no1 = Double.parseDouble(input_1.getText());
                double no2 = Double.parseDouble(input_2.getText());
                result.setText("Division: " + (no1/ no2));
            }
        });

        add.setFont(new Font("Dialog", Font.BOLD, 25));
        sub.setFont(new Font("Dialog", Font.BOLD, 25));
        mul.setFont(new Font("Dialog", Font.BOLD, 25));
        div.setFont(new Font("Dialog", Font.BOLD, 25));
        input_1.setFont(new Font("Dialog", Font.PLAIN, 20));
        input_2.setFont(new Font("Dialog", Font.PLAIN, 20));
        result.setFont(new Font("Dialog", Font.BOLD, 20));
        name.setFont(new Font("Times New Roman", Font.BOLD, 35));

        result.setOpaque(true);
        result.setBackground(new Color(0x90e0ef));
        name.setForeground(new Color(0xe01e37));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
