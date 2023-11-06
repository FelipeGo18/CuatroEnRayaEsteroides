package model;

import java.awt.Color;

/**
 *
 * @author lokci
 */
public class Ficha {

    private Color[] color;
    private Color currentColor;
    private int current;

    public Ficha() {
        color = new Color[] {
            new Color(168, 237, 78),  // Verde
            new Color(235, 152, 131), // Rojo
            new Color(133, 138, 153), // Gris
            new Color(95, 107, 79),    // Militar
            new Color(131, 157, 235) // Azul
        };
        current = 0;
        currentColor = color[current];
    }

    public Color nextColor() {
        current = (current + 1) % color.length;
        currentColor = color[current];
        return currentColor;
    }
    
    
}