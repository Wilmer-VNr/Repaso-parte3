package org.example;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ingreso de Estudiante");
        frame.setContentPane(new form2().mainPanel);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}