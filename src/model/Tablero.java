package model;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class Tablero {
    private BotonRedondo[][] tablero;
    private int[] filasDisponibles;
    private JButton[][] botonesTablero;

 public void iniTablero(JPanel pTablero, ActionListener actionListener) {
    tablero = new BotonRedondo[6][7];
    filasDisponibles = new int[7];
    botonesTablero = new JButton[6][7];

    Color customColorBlue = new Color(133, 157, 235);
    pTablero.setBackground(customColorBlue);

    for (int columna = 0; columna < filasDisponibles.length; columna++) {
        filasDisponibles[columna] = 5; 
    }

    for (int fila = 0; fila < tablero.length; fila++) {
        for (int columna = 0; columna < tablero[fila].length; columna++) {
            tablero[fila][columna] = new BotonRedondo();
            tablero[fila][columna].addActionListener(actionListener);
            botonesTablero[fila][columna] = tablero[fila][columna];
            pTablero.add(tablero[fila][columna]);
        }
    }
}

    public int getFilaDisponible(int columna) {
        return filasDisponibles[columna];
    }

    public JButton[][] getBotonesTablero() {
        return botonesTablero;
    }

    public void setFilaDisponible(int columna, int fila) {
        filasDisponibles[columna] = fila;
    }

    
    public  int getColumnaDelBoton(JButton button, JButton[][] botonesTablero) {
        for (int fila = 0; fila < botonesTablero.length; fila++) {
            for (int columna = 0; columna < botonesTablero[fila].length; columna++) {
                if (botonesTablero[fila][columna] == button) {
                    return columna;
                }
            }
        }
        return -1; // Botón no encontrado en el tablero
    }
    public boolean verificarGanador(int fila, int columna, Color color) {
        return (verificarHorizontal(fila, columna, color) || 
                verificarVertical(fila, columna, color) || 
                verificarDiagonalDerecha(fila, columna, color) || 
                verificarDiagonalIzquierda(fila, columna, color));
    }

    private boolean verificarHorizontal(int fila, int columna, Color color) {
        int count = 0;
        for (int c = 0; c < 7; c++) {
            if (tablero[fila][c].getBackground().equals(color)) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean verificarVertical(int fila, int columna, Color color) {
        int count = 0;
        for (int f = 0; f < 6; f++) {
            if (tablero[f][columna].getBackground().equals(color)) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean verificarDiagonalDerecha(int fila, int columna, Color color) {
        int count = 0;
        for (int f = fila, c = columna; f < 6 && c < 7; f++, c++) {
            if (tablero[f][c].getBackground().equals(color)) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        for (int f = fila - 1, c = columna - 1; f >= 0 && c >= 0; f--, c--) {
            if (tablero[f][c].getBackground().equals(color)) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean verificarDiagonalIzquierda(int fila, int columna, Color color) {
        int count = 0;
        for (int f = fila, c = columna; f < 6 && c >= 0; f++, c--) {
            if (tablero[f][c].getBackground().equals(color)) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        for (int f = fila - 1, c = columna + 1; f >= 0 && c < 7; f--, c++) {
            if (tablero[f][c].getBackground().equals(color)) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}





class BotonRedondo extends JButton {
    public BotonRedondo() {
        setContentAreaFilled(false);
        setFocusPainted(false);
        setPreferredSize(new Dimension(50, 50)); // Personaliza el tamaño del botón
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(getBackground());
        } else {
            g.setColor(getBackground());
        }
        int radio = Math.min(getSize().width, getSize().height);
        g.fillRoundRect(0, 0, getSize().width, getSize().height, radio, radio);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(java.awt.Graphics g) {
        g.setColor(getForeground());
        int radio = Math.min(getSize().width, getSize().height);
        g.drawRoundRect(0, 0, getSize().width, getSize().height, radio, radio);
    }
}