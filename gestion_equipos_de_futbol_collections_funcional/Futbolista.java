package gestion_equipos_de_futbol_collections_funcional;

import java.util.ArrayList;



public class Futbolista implements Deportista{
    
    private String nombreFutbolista;
    private int edad;
    private Posicion posicion;

    
    public Futbolista(String nombreFutbolista, int edad, Posicion posicion) {
        this.nombreFutbolista = nombreFutbolista;
        this.edad = edad;
        this.posicion = posicion;
    }


    public String getNombreFutbolista() {
        return nombreFutbolista;
    }


    public void setNombreFutbolista(String nombreFutbolista) {
        this.nombreFutbolista = nombreFutbolista;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Posicion getPosicion() {
        return posicion;
    }


    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public int getAnosProfecional() {
        return 0;
    }


    @Override
    public ArrayList<Equipo> getListadoEquipos() {
        return null;
    }


    @Override
    public int getTotalTrofeos() {
        return 0;
    }

    @Override
    public String toString() {
        return 
        
        "\nnombreFutbolista=" + nombreFutbolista + 
        "\nedad=" + edad + 
        "\nposicion=" + posicion + "\n";
    }
}
