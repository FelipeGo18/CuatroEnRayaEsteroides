package model;

/**
 *
 * @author lokci
 */
public class Maquina extends Player {

    public Maquina(String nombre, int juegos, int ganadas, int empates, double efectividad, Ficha[] fichero) {
        super(nombre, juegos, ganadas, empates, efectividad, fichero);
    }

    @Override
    public void jugar() {
       
    }

   
}
