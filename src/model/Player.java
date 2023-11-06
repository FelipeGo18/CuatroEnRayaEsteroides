package model;

/**
 *
 * @author lokci
 */
public abstract class Player{
    
    private final String nombre;
    private int juegos;
    private int ganadas;
    private int empates;
    private double efectividad;
    private Ficha[] fichero;

    public Player(String nombre, int juegos, int ganadas, int empates, double efectividad, Ficha[] fichero) {
        
        this.nombre = nombre;
        this.juegos = juegos;
        this.ganadas = ganadas;
        this.empates = empates;
        this.efectividad = efectividad;
        fichero = new Ficha[21];
        
    }
    
    public abstract void jugar();
    
    public void rellenar(){       
                
    }

    public String getNombre() {
        return nombre;
    }

    public int getJuegos() {
        return juegos;
    }

    public int getGanadas() {
        return ganadas;
    }

    public int getEmpates() {
        return empates;
    }

    public double getEfectividad() {
        return efectividad;
    }

    public Ficha[] getFichero() {
        return fichero;
    }
    
    public String imprimir(){
        
        String imprimir = "";
        
        return imprimir;
        
    }
    
    
    
}
