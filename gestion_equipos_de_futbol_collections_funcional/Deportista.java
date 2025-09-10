package gestion_equipos_de_futbol_collections_funcional;

import java.util.ArrayList;



public interface Deportista {
    
    public int getAnosProfecional();

    public ArrayList<Equipo> getListadoEquipos();

    public int getTotalTrofeos();
}
