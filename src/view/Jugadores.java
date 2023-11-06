package view;

import javax.swing.*;
import java.awt.*;

public class Jugadores extends JFrame {

    private JLabel LabelJ1, LabelJ2, tituloLabel;
    private JTextField TFJ1, TFJ2;
    private Color customColorBlue,customColorGreen;
    private JButton bColor1, bColor2, bJugar, bRegresar;
    private ImageIcon iTitle, iNombre1, iColor, iJugar, iRegresar;

    public Jugadores() {

        //Crea la ventana
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        //Fondo
        customColorBlue = new Color(133, 157, 235);        
        customColorGreen = new Color(168, 237, 78);
        getContentPane().setBackground(customColorBlue);

        //Titulo
        iTitle = new ImageIcon(Jugadores.class.getResource("/resources/game/Titulo Jugadores.png "));
        tituloLabel = new JLabel(iTitle);
        tituloLabel.setBounds(125, 20, 350, 80);

        //Label nombre
        iNombre1 = new ImageIcon(Jugadores.class.getResource("/resources/game/Nombre Jugadores.png"));
        LabelJ1 = new JLabel(iNombre1);
        LabelJ1.setBounds(10, 90, 150, 100);
        LabelJ2 = new JLabel(iNombre1);
        LabelJ2.setBounds(10, 190, 150, 100);

        //Textfields
        TFJ1 = new JTextField(20);
        TFJ1.setBounds(160, 120, 250, 40);
        TFJ2 = new JTextField(20);
        TFJ2.setBounds(160, 220, 250, 40);

        //Botones de color
        iColor = new ImageIcon(Jugadores.class.getResource("/resources/game/Color Jugadores.png"));
        bColor1 = new JButton(iColor);
        bColor1.setBounds(430,120,130,40);
        bColor1.setBackground(customColorBlue);
        bColor2 = new JButton(iColor);
        bColor2.setBounds(430,220,130,40);
        bColor2.setBackground(customColorGreen);
        
        //Botones Jugar y Regresar
        iJugar = new ImageIcon(Jugadores.class.getResource("/resources/game/Jugar Jugadores.png"));
        iRegresar = new ImageIcon(Jugadores.class.getResource("/resources/game/Regresar Jugadores.png"));
        bJugar = new JButton(iJugar);
        bRegresar = new JButton(iRegresar);
        bJugar.setBounds(150,320,130,40);
        bRegresar.setBounds(300,320,130,40);
        
        add(tituloLabel);
        add(LabelJ1);
        add(LabelJ2);
        add(TFJ1);
        add(TFJ2);
        add(bColor1);        
        add(bColor2);
        add(bJugar);
        add(bRegresar);

        setVisible(true);
    }

    public JTextField getTFJ1() {
        return TFJ1;
    }

    public JTextField getTFJ2() {
        return TFJ2;
    }

    public JButton getbColor1() {
        return bColor1;
    }

    public JButton getbColor2() {
        return bColor2;
    }

    public JButton getbJugar() {
        return bJugar;
    }

    public JButton getbRegresar() {
        return bRegresar;
    }
    
    
}
