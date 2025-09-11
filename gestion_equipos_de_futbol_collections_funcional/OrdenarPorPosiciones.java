package gestion_equipos_de_futbol_collections_funcional;

import java.util.Comparator;

public class OrdenarPorPosiciones implements Comparator<Futbolista> {

    @Override
    public int compare(Futbolista f1, Futbolista f2)
        {
        int posicion = Integer.compare(f1.getPosicion().getSalarioMax(), f2.getPosicion().getSalarioMax());
        // si deseo ordenar por posicion y no por valor numerico se hace con ordinal(). ejemplo:
        // int posicion Integer.compare(a1.ordinal(), a2.ordinal());
        return posicion;
    }
}