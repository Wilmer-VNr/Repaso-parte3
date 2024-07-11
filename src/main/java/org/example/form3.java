package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 {
    private JTextField consultatxt;
    public JPanel mainPanel3;
    private JButton buscar;

    public form3() {
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedulaConsulta = consultatxt.getText();
                String[] datos = form1.getDatos();
                int contador = form1.getContador();
                boolean encontrado = false;

                for (int i = 0; i < contador; i++) {
                    if (datos[i].contains(cedulaConsulta)) {
                        encontrado = true;
                        JOptionPane.showMessageDialog(mainPanel3, "Estudiante encontrado:\n" + datos[i], "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(mainPanel3, "Estudiante no encontrado.", "Resultado", JOptionPane.WARNING_MESSAGE);
                }

                consultatxt.setText(""); // Limpiar el campo de consulta
            }
        });
    }

    public JPanel getMainPanel3() {
        return mainPanel3;
    }
}