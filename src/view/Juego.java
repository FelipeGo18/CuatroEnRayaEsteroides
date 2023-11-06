package view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class Juego extends JFrame {

    private JLabel tituloLabel, lTurno, lJugador1, lJugador2, lColor1, lColor2;
    private JPanel pTablero, pTurno;
    private Color customColorBlue, customColorMilitar;
    private LineBorder borde;
    private Font fuente;
    private JButton revanchaBoton, menuBoton, regresarBoton;
    private ImageIcon imagen;

    public Juego() {

        //Ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860, 710);
        setLocationRelativeTo(null);
        setLayout(null);
        borde = new LineBorder(customColorMilitar, 1);

        //Color fondo
        customColorMilitar = new Color(95, 107, 79);
        customColorBlue = new Color(133, 157, 235);
        getContentPane().setBackground(customColorBlue);

        //Crea el label del turno
        lTurno = new JLabel("Turno");
        lTurno.setBounds(655, 140, 150, 80);
        fuente = new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 40);
        lTurno.setFont(fuente);
        lTurno.setHorizontalAlignment(SwingConstants.CENTER);
        pTurno = new JPanel();
        pTurno.setBounds(655, 140, 150, 80);
        pTurno.setBorder(borde);
        pTurno.add(lTurno);

        //Crea labels de jugadores
        lJugador1 = new JLabel("Anónimo 1");
        lJugador1.setBounds(655, 240, 90, 20);
        fuente = new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 15);
        lJugador1.setFont(fuente);
        lJugador1.setHorizontalAlignment(SwingConstants.CENTER);

        lJugador2 = new JLabel("Anónimo 2");
        lJugador2.setBounds(655, 280, 90, 20);
        fuente = new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 15);
        lJugador2.setFont(fuente);
        lJugador2.setHorizontalAlignment(SwingConstants.CENTER);

        //Crea labels de los colores de los jugadores                 
        lColor1 = new JLabel();
        lColor1.setBounds(765, 240, 40, 20);
        lColor1.setOpaque(true);
        lColor1.setBorder(borde);
        lColor1.setBackground(customColorBlue);

        lColor2 = new JLabel();
        lColor2.setBounds(765, 280, 40, 20);
        lColor2.setBorder(borde);
        lColor2.setOpaque(true);
        lColor2.setBackground(customColorBlue);

        //Crea boton revancha
        imagen = new ImageIcon(Juego.class.getResource("/resources/juego/Revancha.png"));
        revanchaBoton = new JButton(imagen);
        revanchaBoton.setBounds(655, 330, 150, 80);
        revanchaBoton.setVisible(false);

        //Crea boton menu
        imagen = new ImageIcon(Juego.class.getResource("/resources/juego/Menú.png"));
        menuBoton = new JButton(imagen);
        menuBoton.setBounds(655, 440, 150, 80);

        //Crea boton regresar
        imagen = new ImageIcon(Juego.class.getResource("/resources/juego/Regresar_Tablero.png"));
        regresarBoton = new JButton(imagen);
        regresarBoton.setBounds(655, 550, 150, 80);

        imagen = new ImageIcon(Juego.class.getResource("/resources/juego/4ERT.png"));
        tituloLabel = new JLabel(imagen);
        tituloLabel.setBounds(40, 20, 765, 90);

        //Panel tablero
        pTablero = new JPanel();
        pTablero.setLayout(new GridLayout(6, 7));
        pTablero.setBounds(40, 150, 600, 480);
        int grosorBorde = 5; // Grosor personalizado
        LineBorder bordePersonalizado = new LineBorder(customColorMilitar, grosorBorde);
        pTablero.setBorder(bordePersonalizado);

        //Añadir componentes en el JFrame
        add(revanchaBoton);
        add(regresarBoton);
        add(menuBoton);
        add(lColor1);
        add(lColor2);
        add(lJugador1);
        add(lJugador2);
        add(pTurno);
        add(tituloLabel);
        add(pTablero);

        setVisible(true);

    }

    public JButton getRevanchaBoton() {
        return revanchaBoton;
    }

    public JButton getMenuBoton() {
        return menuBoton;
    }

    public JButton getRegresarBoton() {
        return regresarBoton;
    }

    public JLabel getlJugador1() {
        return lJugador1;
    }

    public JLabel getlJugador2() {
        return lJugador2;
    }

    public JLabel getlColor1() {
        return lColor1;
    }

    public JLabel getlColor2() {
        return lColor2;
    }

    public void setlJugador1(JLabel lJugador1) {
        this.lJugador1 = lJugador1;
    }

    public void setlJugador2(JLabel lJugador2) {
        this.lJugador2 = lJugador2;
    }

    public JPanel getpTablero() {
        return pTablero;
    }

    public JPanel getpTurno() {
        return pTurno;
    }        

}
