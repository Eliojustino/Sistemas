/**************************************
 * Autor: Cruz Ortega Elio Justino    *
 * Fecha Creación: 17/03/23           *
 * Fecha Actualización:	19/03/23      *
 * Descripción: Método burbuja        *
 **************************************/

package Ejercicio2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana1 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    // Declaración de atributos
    private JLabel etiqueta;
    private JPanel panel;
    private JTextField valX;
    // Constructor
    public Ventana1() {

        // Se crea el panel
        panel = new JPanel();
        panel.setBounds(10, 10, 380, 38);

        // Se agrega el color de la ventana
        panel.setBackground(new Color(255, 13, 10));
        panel.setLayout(null);
        add(panel);

        // Se agregan los mensajes que aparecerán en la ventana

        // Título del programa y método utilizado
        etiqueta = new JLabel("Método Burbuja");
        etiqueta.setBounds(120, 20, 200, 30);
        panel.add(etiqueta);

        // Mensaje para que el usuario introduzca la cantidad de números a ordenar
        etiqueta = new JLabel("Ingresa la cantidad de números a ordenar: ");
        etiqueta.setBounds(20, 50, 400, 20);
        panel.add(etiqueta);

        // Campo de texto para que el usuario introduzca la cantidad de números
        valX = new JTextField();
        valX.setBounds(325, 50, 50, 20);
        panel.add(valX);

        // Mensaje para que el usuario digite todos los números a leer
        etiqueta = new JLabel("Números a leer: ");
        etiqueta.setBounds(20, 75, 200, 20);
        panel.add(etiqueta);

        // Campo de texto para que el usuario introduzca los números, separados por un espacio
        // El programa solo leerá hasta la cantidad de números que el
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}