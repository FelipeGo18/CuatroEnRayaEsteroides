/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import view.Jugadores;

/**
 *
 * @author lokci
 */
public class Stats {            
    public DefaultListModel configurarJugadoresList(ArrayList<Jugadores> jugadores) {
        DefaultListModel<Jugadores> JugadoresListModel = new DefaultListModel<>();

        for (Jugadores jugador : jugadores) {
            JugadoresListModel.addElement(jugador);
        }

        return JugadoresListModel;
    }    
}
