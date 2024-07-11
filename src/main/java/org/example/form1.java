package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField nombre;
    private JTextField apellido;
    private JTextField cedula;
    private JTextField edad;
    private JTextField email;
    private JTextField telefono;
    public JPanel mainPanel1;
    private JButton ingresarDatos;
    private static String[] datos = new String[100];
    private static int contador = 0;

    public form1() {
        datos = new String[6];

        ingresarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String nombreText = nombre.getText();
                    String cedulaText = cedula.getText();
                    int edadText = Integer.parseInt(edad.getText());
                    String apellidoText = apellido.getText();
                    String telefonoText = telefono.getText();
                    String correoText = email.getText();

                    Estudiante estudiante = new Estudiante(nombreText,cedulaText,edadText,apellidoText,telefonoText,correoText);


                    datos[contador] = estudiante.toString();
                    contador++;

                    nombre.setText("");
                    apellido.setText("");
                    cedula.setText("");
                    edad.setText("");
                    telefono.setText("");
                    email.setText("");

                    JOptionPane.showMessageDialog(mainPanel1, "Datos ingresados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(mainPanel1, "Por favor, ingrese una edad válida.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static String[] getDatos() {
        return datos;
    }

    public static int getContador() {
        return contador;
    }
}