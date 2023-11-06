package controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import view.*;

/**
 * Comunica y controla las acciones de la vista y el modelo.
 *
 * @author lokci
 */
public class Controller implements ActionListener {
//hola mundo esto es un prueba
    
    private Bienvenida bien;
    private Seleccionar select;
    private Jugadores jug;
    private Estadisticas est;
    private Juego jue;
    private Info info;
    private Ficha ficha;
    private Tablero table;
    private Color color1, color2;
    private JList<Jugadores> jugadoresList;
    private int turno = 1;

    public Controller() {
        bien = new Bienvenida();
        bien.getBotonInicio().addActionListener(this);
        bien.getBotonInfo().addActionListener(this);
        ficha = new Ficha();
        table = new Tablero();
    }

    public void Controller(Bienvenida bien) {
        this.bien = bien;
        bien.getBotonInicio().addActionListener(this);
        bien.getBotonInfo().addActionListener(this);
    }

    public void Controller(Seleccionar select) {
        this.select = select;
        select.getBotonJCJ().addActionListener(this);
        select.getBotonJCM().addActionListener(this);
        select.getBotonMCM().addActionListener(this);
        select.getBotonSTATS().addActionListener(this);
        select.getBotonReturn().addActionListener(this);
    }

    public void Controller(Estadisticas est) {
        this.est = est;

        est.getRegresarButton().addActionListener(this);
    }

    public void Controller(Jugadores jug) {
        this.jug = jug;

        jug.getTFJ1().addActionListener(this);
        jug.getTFJ2().addActionListener(this);
        jug.getbColor1().addActionListener(this);
        jug.getbColor2().addActionListener(this);
        jug.getbJugar().addActionListener(this);
        jug.getbRegresar().addActionListener(this);

    }

    public void Controller(Juego jue) {
        this.jue = jue;
        jue.getRegresarBoton().addActionListener(this);
        jue.getRevanchaBoton().addActionListener(this);
        jue.getMenuBoton().addActionListener(this);
    }

    public void Controller(Info info) {
        this.info = info;

        info.getbRegresar().addActionListener(this);

    }

    public JList<Jugadores> getJugadoresList() {
        return jugadoresList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (bien != null && e.getSource() == bien.getBotonInicio()) {
            bien.dispose();
            select = new Seleccionar();
            Controller(select);
        }
        if (bien != null && e.getSource() == bien.getBotonInfo()) {
            bien.dispose();
            info = new Info();
            Controller(info);

        }
        if (info != null && e.getSource() == info.getbRegresar()) {
            info.dispose();
            bien = new Bienvenida();
            Controller(bien);

        }
        if (select != null && e.getSource() == select.getBotonJCJ()) {
            select.dispose();
            jug = new Jugadores();
            Controller(jug);

        }
        if (select != null && e.getSource() == select.getBotonJCM()) {
            select.dispose();
            jug = new Jugadores();
            Controller(jug);

        }
        if (select != null && e.getSource() == select.getBotonMCM()) {
            select.dispose();
            jug = new Jugadores();
            Controller(jug);
        }
        if (select != null && e.getSource() == select.getBotonSTATS()) {
            select.dispose();
            est = new Estadisticas();
            Controller(est);
        }
        if (select != null && e.getSource() == select.getBotonReturn()) {
            select.dispose();
            bien = new Bienvenida();
            Controller(bien);
        }
        if (jug != null && e.getSource() == jug.getbRegresar()) {
            jug.dispose();
            select = new Seleccionar();
            Controller(select);
        }
        if (est != null && e.getSource() == est.getRegresarButton()) {
            est.dispose();
            select = new Seleccionar();
            Controller(select);
        }
        if (jug != null && e.getSource() == jug.getbJugar()) {
            //Crea pantalla
            jug.dispose();
            jue = new Juego();
            Controller(jue);

            //Cambia el color de los jugadores
            color1 = jug.getbColor1().getBackground();
            jue.setBackground(color1);
            jue.getlColor1().setBackground(color1);
            color2 = jug.getbColor2().getBackground();
            jue.setBackground(color2);
            jue.getlColor2().setBackground(color2);

            //Cambia el nombre de los jugadores 
            if (!jug.getTFJ1().getText().isEmpty()) {
                jue.getlJugador1().setText(jug.getTFJ1().getText());
            }
            if (!jug.getTFJ2().getText().isEmpty()) {
                jue.getlJugador2().setText(jug.getTFJ2().getText());
            }
            //Inicializa el tablero
            jue.getpTurno().setBackground(jug.getbColor1().getBackground());
            table.iniTablero(jue.getpTablero(), this);

        }
        if (jue != null && e.getSource() == jue.getRegresarBoton()) {
            jue.dispose();
            jug = new Jugadores();
            Controller(jug);
            turno = 1;
        }
        if (jue != null && e.getSource() == jue.getRevanchaBoton()) {
            
            

        }
        if (jue != null && e.getSource() == jue.getMenuBoton()) {
            jue.dispose();
            bien = new Bienvenida();
            Controller(bien);
            turno = 1;
        }
        if (jug != null && e.getSource() == jug.getbColor1()) {
            do {
                jug.getbColor1().setBackground(ficha.nextColor());
            } while (jug.getbColor1().getBackground().equals(jug.getbColor2().getBackground()));
        }

        if (jug != null && e.getSource() == jug.getbColor2()) {
            do {
                jug.getbColor2().setBackground(ficha.nextColor());
            } while (jug.getbColor2().getBackground().equals(jug.getbColor1().getBackground()));
        }

        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            if (jue != null && button.getParent() == jue.getpTablero()) {
                int columna = table.getColumnaDelBoton(button, table.getBotonesTablero());
                int fila = table.getFilaDisponible(columna);
                if (fila >= 0) {
                    if (turno == 1) {
                        table.getBotonesTablero()[fila][columna].setBackground(jug.getbColor1().getBackground());
                        table.setFilaDisponible(columna, fila - 1);
                        jue.getpTurno().setBackground(jug.getbColor2().getBackground());
                        if (table.verificarGanador(fila, columna, jug.getbColor1().getBackground())) {
                            JOptionPane.showMessageDialog(null, jue.getlJugador1());
                            jue.getRevanchaBoton().setVisible(true);
                        }
                        turno = 2;
                    } else {
                        table.getBotonesTablero()[fila][columna].setBackground(jug.getbColor2().getBackground());
                        table.setFilaDisponible(columna, fila - 1);
                        jue.getpTurno().setBackground(jug.getbColor1().getBackground());
                        if (table.verificarGanador(fila, columna, jug.getbColor2().getBackground())) {
                            JOptionPane.showMessageDialog(null, jue.getlJugador2());
                            jue.getRevanchaBoton().setVisible(true);
                        }
                        turno = 1;
                    }
                }
            }
        }
    }
}
