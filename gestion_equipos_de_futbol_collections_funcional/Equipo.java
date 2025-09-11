package gestion_equipos_de_futbol_collections_funcional;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    
    private String nombreEquipo;

    private ArrayList<Futbolista> futbolistas;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.futbolistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Futbolista> getFutbolistas() {
        return futbolistas;
    }

    public void setFutbolistas(ArrayList<Futbolista> futbolistas) {
        this.futbolistas = futbolistas;
    }

    public void agrgarFutbolista(Futbolista futbolista) 
    {
        if (futbolista != null)
        { 
                this.futbolistas.add(futbolista);
        }
    }

    public void listarFormacionEquipo()
    {
         futbolistas.stream()
        .sorted(new OrdenarPorPosiciones())
        .forEach(System.out::print);

    }

    
}
