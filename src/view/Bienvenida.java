package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author gonza
 */
public class Bienvenida extends JFrame {

    private ImageIcon imageTablero, imagenTitulo, imagenBoton, imagenInfo;
    private JLabel labelTablero, labelTitulo;
    private JButton botonInicio, botonInfo;
    private Color customColorBlue;
    private LineBorder borde;

    public Bienvenida() {

        //Crea la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 560);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //Crea y asigna el color al fondo
        customColorBlue = new Color(133, 157, 235);
        borde = new LineBorder(customColorBlue, 1);
        getContentPane().setBackground(customColorBlue);
        
        //Crea y asigna las imagenes y botones
        imageTablero = new ImageIcon(Bienvenida.class.getResource("/resources/bien/Tablero.png"));
        labelTablero = new JLabel(imageTablero);
        labelTablero.setBounds(0, -60, 600, 600);

        imagenTitulo = new ImageIcon(Bienvenida.class.getResource("/resources/bien/Titulo.png"));
        labelTitulo = new JLabel(imagenTitulo);
        labelTitulo.setBounds(625, 80, 250, 250);

        imagenBoton = new ImageIcon(Bienvenida.class.getResource("/resources/bien/Boton.png"));
        botonInicio = new JButton(imagenBoton);
        botonInicio.setBounds(655, 380, 190, 110);

        imagenInfo = new ImageIcon(Bienvenida.class.getResource("/resources/bien/Informacion.png"));
        botonInfo = new JButton(imagenInfo);
        botonInfo.setBounds(860, 10, 50, 50);
        botonInfo.setBackground(customColorBlue);
        botonInfo.setBorder(borde);

        //Agrega items
        add(botonInfo);
        add(botonInicio);
        add(labelTitulo);
        add(labelTablero);
        setVisible(true);

    }

    public JButton getBotonInicio() {
        return botonInicio;
    }

    public JButton getBotonInfo() {
        return botonInfo;
    }

}
