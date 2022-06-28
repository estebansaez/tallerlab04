package guis;

import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaSecundaria extends JFrame {
    public JPanel panel;

    public VentanaSecundaria(){
        this.setSize(400,400);
        setTitle("Agregar Estudiante");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        etiquetas();
        cajasDeTexto();
        botones();

    }
    private void etiquetas(){
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Nombre: ");
        etiqueta1.setBounds(30,80,80,20);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Email:  ");
        etiqueta2.setBounds(30,100,80,20);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("RUT:   ");
        etiqueta3.setBounds(30,60,80,20);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta3);
    }
    private void cajasDeTexto(){
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(100,80,100,20);
        panel.add(cajaTexto1);

        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(100,100,100,20);
        panel.add(cajaTexto2);

        JTextField cajaTexto3 = new JTextField();
        cajaTexto3.setBounds(100,60,100,20);
        panel.add(cajaTexto3);
    }
    private void botones(){
        JButton boton1 = new JButton();
        boton1.setText("Agregar Estudiante");
        boton1.setBounds(100,300,100,20);
        panel.add(boton1);

        JButton boton2 = new JButton();
        boton2.setText("cancelar");
        boton2.setBounds(200,300,100,20);
        panel.add(boton2);

    }
}
