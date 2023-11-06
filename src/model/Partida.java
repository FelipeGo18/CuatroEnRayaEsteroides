package model;

import model.*;

/**
 *
 * @author lokci
 */
public class Partida {

    private final Player pjugador;
    private final Player sjugador;
    private Player ganador;
    private Ficha fichas;
    private Tablero tablero;
    private int jugadas;

    public Partida(Player pjugador, Player sjugador, Player ganador, Ficha fichas, Tablero tablero, int jugadas) {
        this.pjugador = pjugador;
        this.sjugador = sjugador;
        this.ganador = ganador;
        this.fichas = fichas;
        this.tablero = tablero;
        this.jugadas = jugadas;
    }

    public void ganador() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {

                //if (tablero.getTablero()[i] == tablero.getTablero()[j]) {
                    
                    
                                        
                }
            }
        }
    }



