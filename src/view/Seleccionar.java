package view;

import javax.swing.*;
import java.awt.*;

public class Seleccionar extends JFrame {

    private JButton botonJCM, botonJCJ, botonMCM, botonSTATS, botonReturn;
    private JLabel labelTittle;
    private Color customColorBlue;
    private ImageIcon imageTitle, imageJCJ, imageJCM, imageMCM, imageSTATS, imageReturn;

    public Seleccionar() {
        
        //Crea la ventana
        setTitle("Cuatro en Raya");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,300);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //Crea los colores y asigna el color del fondo
        customColorBlue = new Color(133,157,235);
        getContentPane().setBackground(customColorBlue);

        //Crea y agrega el título
        imageTitle = new ImageIcon(Seleccionar.class.getResource("/resources/select/Titulo Acciones.png"));
        labelTittle = new JLabel(imageTitle);
        labelTittle.setBounds(100,-10,800,100);
        
        //Crea y agrega los botones
        imageJCJ = new ImageIcon(Seleccionar.class.getResource("/resources/select/JCJ.png"));
        botonJCJ = new JButton(imageJCJ);
        botonJCJ.setBounds(80,80,150,80);
        
        imageJCM = new ImageIcon(Seleccionar.class.getResource("/resources/select/JCM.png"));
        botonJCM = new JButton(imageJCM);
        botonJCM.setBounds(310,80,150,80);
        
        imageMCM = new ImageIcon(Seleccionar.class.getResource("/resources/select/MCM.png"));
        botonMCM = new JButton(imageMCM);
        botonMCM.setBounds(540,80,150,80);
        
        imageSTATS = new ImageIcon(Seleccionar.class.getResource("/resources/select/STATS.png"));
        botonSTATS = new JButton(imageSTATS);
        botonSTATS.setBounds(770,80,150,80);
        
        imageReturn = new ImageIcon(Seleccionar.class.getResource("/resources/select/Regresar.png"));
        botonReturn = new JButton(imageReturn);
        botonReturn.setBounds(425,170,150,80);               
        
        //Agrega los elementos y lo visibiliza
        add(labelTittle);
        add(botonJCJ);
        add(botonJCM);
        add(botonMCM);
        add(botonSTATS);
        add(botonReturn);
        
        setVisible(true);
    }

    public JButton getBotonJCM() {
        return botonJCM;
    }

    public JButton getBotonJCJ() {
        return botonJCJ;
    }

    public JButton getBotonMCM() {
        return botonMCM;
    }

    public JButton getBotonSTATS() {
        return botonSTATS;
    }

    public JButton getBotonReturn() {
        return botonReturn;
    }
    
    
    
}