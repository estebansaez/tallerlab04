package guis;

import datos.DatosEstudiantes;

import javax.swing.*;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class VentanaPrincipal extends JFrame {
    public JPanel panel;

    public VentanaPrincipal(){
        this.setSize(500,400);
        setTitle("Curso ICC264");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();

    }

    private void iniciarComponentes(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        colocarEtiquetas();
        colocarBotonComboBox();
        botonNuevoEstudiante();
        CajasDeTexto();
    }

    private void colocarEtiquetas(){
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
        etiqueta3.setBounds(30,22,100,20);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta3);
    }

    private void CajasDeTexto(){
        JTextField cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(100,80,100,20);
        panel.add(cajaTexto1);

        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(100,100,100,20);
        panel.add(cajaTexto2);
    }

    private void colocarBotonComboBox(){
        JComboBox comboBox = new JComboBox(DatosEstudiantes.rutDesplegables());
        comboBox.setToolTipText("RUT Estudiantes ICC264");
        comboBox.setBounds(100,20,100,30);
        panel.add(comboBox);
    }

    private void botonNuevoEstudiante(){
        JButton boton2 = new JButton();
        boton2.setText("Nuevo Estudiante");
        boton2.setBounds(150,300,150,20);
        panel.add(boton2);
    }
}